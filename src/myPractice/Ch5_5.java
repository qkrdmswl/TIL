package myPractice;

class Shape{//���� Ŭ����
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() {// �޼ҵ� �������̵�
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class Ch5_5 {
	public static void main(String[]args) {
		Shape start, last, obj;
		
		// linked list�� ���� �����Ͽ� ����
		start = new Line();  // Line ��ü ����
		last = start;
		obj = new Rect();
		last.next = obj;  // Rect ��ü ����
		last = obj;
		obj = new Line();  // Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle();  // Circle ��ü ����
		last.next = obj;
		
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

}
