package practice;
import java.util.Scanner;

class Grade{
	int a, b, c;
	Grade(int math, int science, int english) {
		this.a = math;
		this.b = science;
		this.c = english;
	}
	int average() {
		int average = (a + b + c) / 3;
		return average;
	}
}
public class Ch4_num2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+ me.average());  //average()�� ����� ����Ͽ� ����
		
		sc.close();
	}

}
