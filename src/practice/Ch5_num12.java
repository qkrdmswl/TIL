package practice;

import java.util.Arrays;
import java.util.Scanner;

abstract class Shape3{
	private Shape3 next;
	public Shape3() {next = null;}
	public void setNext(Shape3 obj) {next = obj;}
	public Shape3 getNext() { return next;}
	public abstract void draw(); 
}
class Line extends Shape3{
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape3{
	public void draw() {System.out.println("Rect");}
}
class Circle3 extends Shape3{
	public void draw() {System.out.println("Circle");}
}
class GraphicEditor{
	private String name;
	private Scanner sc = new Scanner(System.in);
	private Shape3 start = null, end = null;
	
	public GraphicEditor(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println("�׷��� ������" + name + "�� �����մϴ�.");
		int choice = 0;
		while(choice != 4) {
			int type, index;
			System.out.println("����(1), ����(2), ��κ���(3), ����(4) >>");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Line(1), Rect(2), Circle(3) >>");
				type = sc.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
				insert(type);
				break;
			case 2:
				System.out.println("������ ������ ��ġ >>");
				index = sc.nextInt();
				if(!(delete(index))){
					System.out.println("������ �� �����ϴ�.");
				} break;
			case 3:
				Shape3 p = start;
				while(p != null) {
					p.draw();
					p = p.getNext();
				} break;
			case 4:
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} System.out.println(name+"�� �����մϴ�.");
	}
	private boolean delete(int index) {
		Shape3 current = start, previous = start;
		if(start == null) return false;
		for(int i=0; i<index; i++) {
			previous = current;
			current = current.getNext();
		    if (current == null) return false;
		}
		if (start == end) {
			start = end = null;
			return true;
		}
		if (current == start) {
			start = start.getNext();
		}
		else if (current == end) {
			end = previous;
			end.setNext(null);
		}else {previous.setNext(current.getNext());}
		return true;
	}
	
	private void insert(int choice) {
		Shape3 obj = null;
		switch(choice) {
		case 1: 
			obj = new Line();
			break;
		case 2: 
			obj = new Rect();
			break;
		case 3: 
			obj = new Circle3();
	    }
	if (start == null) { // ����Ʈ�� ����� ��
		start = end = obj;
	} else {
		end.setNext(obj); // ������ ���� �ڿ� ����
		end = obj;
	}
		
  }
}
public class Ch5_num12 {
	public static void main(String[]args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
	}
}
