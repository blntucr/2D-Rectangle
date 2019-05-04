
public class testrec {
	public static void main(String args[]) {
		Rec2D r1 = new Rec2D(0,0,4,4);
		Rec2D r2 = new Rec2D(0,0,3,3);
		System.out.print(r1.contains(r2)+"\n\n");
		MyPoint a = new MyPoint(2,3);
		MyPoint b = new MyPoint(5,10);
		MyPoint c = new MyPoint(4,12);
		MyPoint[] p = new MyPoint[] {a,b,c};
		Rec2D r3 = Rec2D.getRectangle(p);
		
		System.out.print(r3.height+" "+r3.width+" "+r3.getX()+" "+r3.getY());
	}
}
