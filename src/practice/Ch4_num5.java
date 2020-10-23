package practice;
import java.util.Scanner;
class Circle{
	private double x, y, area, newArea;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double area() {
		return radius * radius;
	}
}
public class Ch4_num5 { // + num6
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Circle c [] = new Circle[3];
		int max=0;
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		for(int i=0; i<c.length-1; i++) { 
			if(c[i].area() < c[i+1].area()) {
				max = i+1; 
			}else {max = i;}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[max].show();
		sc.close();
	}

}
