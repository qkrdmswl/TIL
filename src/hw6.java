//interface Shape{
//	final double PI = 3.14;
//	void draw();                         //abstract method
//	double getArea();                    //abstract method
//	default public void redraw() {       //default method
//		System.out.print("---�ٽ� �׸��ϴ�. ");
//		draw();
//	}
//}
//class Circle implements Shape{
//	int radius;
//	public Circle(int i) {
//		this.radius = i;
//	}
//	public void draw() {
//		System.out.println("�������� "+radius+"�� ���Դϴ�.");
//	}
//	public double getArea() {
//		double area = radius*radius*PI;
//		return area;
//	}
//}
//class Triangle implements Shape{
//	int height, width;
//	public Triangle(int height, int width) {
//		this.height = height;
//		this.width = width;
//	}
//	public void draw() {
//		System.out.println("����:"+height+", �غ�:"+width+"�� �ﰢ���Դϴ�.");
//	}
//	public double getArea() {
//		double area = height * width / 2;
//		return area;
//	}
//}
//class Rect implements Shape{
//	int x, y;
//	public Rect(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	public void draw() {
//		System.out.println(x+"x"+y+"ũ���� �簢�� �Դϴ�.");
//	}
//	public double getArea() {
//		double area = x * y;
//		return area;
//	}
//}
//public class hw6 {
//	public static void main(String[]args) {
//		Shape [] list = new Shape[3];
//		list[0] = new Circle(10);
//		list[1] = new Triangle(20,30);
//		list[2] = new Rect(10,40);
//		for(int i = 0; i<list.length; i++) {
//			list[i].redraw();
//            }
//		double maxArea = 0; // ���� ū ������ �����ϱ� ���� ���� ����
//		for(int i=0; i<list.length; i++) {
//			System.out.println("������ "+list[i].getArea());
//		}
//		for(int i=0; i<list.length-1; i++) {
//			//���� ������ ū ���� ���ϱ�
//			if(list[i].getArea() < list[i+1].getArea()) {
//				maxArea = list[i+1].getArea();
//			}else {maxArea = list[i].getArea(); }
//		}
//		System.out.println("--���� ū ������ "+maxArea+"�Դϴ�.");
//  }
//}
