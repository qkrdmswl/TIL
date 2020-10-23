interface Drawable{
	void draw();
}
abstract class Shape2 implements Drawable{
	public abstract double getArea();
	public abstract double getLength();
}
class Rectangle extends Shape2{
	double x1,y1,x2,y2;
	double area, width, height, length;	
	Rectangle(int x, int y, int a, int b){
		x1=x;
		y1=y;
		x2 = x+a;
		y2 = y+b;
		width = x2-x1;
		height = y2-y1;
	}
	public void draw() {
		System.out.println("Rectangle ("+x1+", "+y1+")-("+x2+", "+y2+")");
	}
	public double getArea() {
		area = width * height;
		return area;
	}
	public double getLength() {
		length = (width + height)*2 ;
		return length;
	}
}
class Circle extends Shape2{
	double x, y, radius, area, length;
	Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle ("+x+", "+y+")-radius("+radius+")");
	}
	public double getArea() {
		area = radius * radius * 3.14;
		return area;
	}
	public double getLength() {
		length = radius * 2 * 3.14;
		return length;
	}
}
public class hw7 {
	public static void main(String[]args) {
		Shape2[] shapes = new Shape2[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		for(Shape2 s: shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		
		Drawable[] drawables = new Drawable[3];
		for(int i=0; i <shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		for(Drawable d: drawables) {
			d.draw();
		}
	}
}
  
