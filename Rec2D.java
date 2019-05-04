import java.awt.geom.Rectangle2D;
import java.util.Arrays;
public class Rec2D {
	double x, y;
	double width, height;
	
	Rec2D(){
		this(0,0,1,1);
	}
	
	Rec2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
	boolean contains(double x, double y) {
		if((this.x + (width / 2) <= x) && (this.y + (height / 2) <= y)
				&& (this.x - (width / 2) >= x) && (this.y - (height / 2)) >= 2)
			return true;
		else
			return false;
	}
	
	boolean contains(Rec2D r) {
		if(this.x + (width / 2) - ((r.width) / 2) >= r.x && 
				(this.y + (height / 2) - ((r.height) / 2 )>= r.y))
			return true;
		else return false;
	}
	
	boolean overlaps(Rec2D r) {
		if((this.x + (width / 2)) >= r.x - (r.width / 2) && 
				(this.y + (height / 2) >= r.y - (r.height / 2)) &&
				(Math.abs(r.x) > this.x) && (Math.abs(r.y) > this.y)) {
				return true;
				}
		else if((this.x - (width / 2) <= r.x + (r.width / 2)) &&
						(this.y - (height / 2) <= r.y +(r.height / 2)) &&
						(Math.abs(r.x) < this.x) && (Math.abs(r.y) < this.y)) {
			return true;
		}
		else 
			return false;
	}
	
	public static Rec2D getRectangle(MyPoint[] p) {
		double[] arrX = new double[p.length];
		double[] arrY = new double[p.length];
		double maxY, minY, maxX, minX;
		for(int i = 0; i < p.length; i++) {
			arrX[i] = p[i].getX();
			arrY[i] = p[i].getY();
		}
		Arrays.sort(arrX);
		Arrays.sort(arrY);
		maxY = arrY[p.length - 1]; minY = arrY[0];
		maxX = arrX[p.length - 1]; minX = arrX[0];
		double newHeight = maxY - minY;
		double newWidth = maxX - minX;
		Rec2D rec = new Rec2D(maxX - (newWidth / 2),
				maxY - (newHeight / 2), newWidth, newHeight);
		return rec;
		
	}
}
