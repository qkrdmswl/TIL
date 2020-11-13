package test;
import java.util.*;

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
class graphicEditor{
	public void run() {
		Vector<String> v = new Vector<String>();
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(choice != 4) {
			System.out.println("����(1), ����(2), ��� ����(3), ����(4)>> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("Line(1), Rect(2), Circle(3)>> ");
				int n = sc.nextInt();
				String shape = null;
				switch(n) {
				case 1 :
					shape = "Line";
					break;
				case 2 :
					shape = "Rect";
					break;
				case 3 :
					shape = "Circle";
					break;
				}
				v.add(shape);
				break;
			case 2 :
				System.out.println("������ ������ ��ġ");
				int i = sc.nextInt();
				if(v.get(i) == null) {System.out.println("������ �� �����ϴ�.");}
				else {
					v.remove(i);
					System.out.println("���� �Ϸ�");
				}
				break;
			case 3 :
				for(int j=0; j< v.size(); j++) {
					String view = v.get(j);
					System.out.println(view);
				}
				break;
			case 4 :
				System.out.println("beauty�� �����մϴ�.");
		
			}
		}
	}
}
public class tutoring10 {
	public static void main(String[]args) {
		graphicEditor ge = new graphicEditor();
		ge.run();	
	}
}
