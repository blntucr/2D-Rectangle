
public class MyPoint {
	private double x, y;
	
	MyPoint(){
		this(0,0);
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(Math.abs(this.x - x), 2) - Math.pow(Math.abs(this.y - y), 2));
		 
}
	public static MyPoint getObject(double x, double y) {
		return new MyPoint(x, y);
	}
}


