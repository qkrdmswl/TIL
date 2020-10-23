package midTerm;

import java.util.Scanner;

class Box{
	private int width;
	private int length;
	private int height;
	private int volume;
	public void setter() {}
	public void getter() {}
	public Box() {
		this.width = 10;
		this.length = 10;
		this.height = 10;
		boxes ++;
	}
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		boxes ++;
	}
	static int boxes;
	static void getBoxes() {
		System.out.println(boxes);
	}
	public void getVolume() {
		volume = width * length * height;
		System.out.println("volume: "+volume);
	}
	
}
public class BoxTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로: ");
		int width = sc.nextInt();
		System.out.println("세로: ");
		int length = sc.nextInt();
		System.out.println("높이: ");
		int height = sc.nextInt();
		
		Box b1 = new Box(width, length, height);
		b1.getVolume();
		b1.getBoxes();
		
		System.out.println("가로: ");
		int width2 = sc.nextInt();
		System.out.println("세로: ");
		int length2 = sc.nextInt();
		System.out.println("높이: ");
		int height2 = sc.nextInt();
		
		Box b2 = new Box(width2, length2, height2);
		b2.getVolume();
		b2.getBoxes();
		
		System.out.println("가로: ");
		int width3 = sc.nextInt();
		System.out.println("세로: ");
		int length3 = sc.nextInt();
		System.out.println("높이: ");
		int height3 = sc.nextInt();
		
		Box b3 = new Box(width3, length3, height3);
		b3.getVolume();
		b3.getBoxes();
		
	}

}
