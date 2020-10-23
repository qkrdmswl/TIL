package practice;
class Point{
	private int x, y;
	public Point() {
		this.x = 0; 
		this.y = 0; 
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class ColorPoint extends Point{
	String color;
	
	ColorPoint(){
		this.color = "BLACK";
	}
	
	ColorPoint(int x, int y) {
		super(x, y);
	}
	public void setXY(int x, int y){
		move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}
}
class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	public void moveUp() {
		this.z = z+1;
	}
	public void moveDown() {
		this.z = z-1;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
}
class PositivePoint extends Point{
	PositivePoint(){
		super(0,0);
	}
	PositivePoint(int x, int y){
		super(x, y);
		if (x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	public void move(int x, int y) {
		if(x > 0 && y > 0) {
			super.move(x, y);
		}else {return;}
	}
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
}
public class Ch5_num5 { // +num6
	public static void main(String[]args) {
		//8번
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
		
//      6번
//		ColorPoint cp = new ColorPoint();
//		System.out.println(cp.toString()+"입니다.");
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString()+"입니다.");

//      7번		
//		Point3D p = new Point3D(1,2,3);
//		System.out.println(p.toString()+"입니다.");
//		
//		p.moveUp();
//		System.out.println(p.toString()+"입니다.");
//		
//		p.moveDown();
//		p.move(10, 10);
//		System.out.println(p.toString()+"입니다.");
//		
//		p.move(100, 200, 300);
//		System.out.println(p.toString()+"입니다.");
	}
	
}
