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
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+ me.average());  //average()는 평균을 계산하여 리턴
		
		sc.close();
	}

}
