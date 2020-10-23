package practice;
import java.util.Scanner;

public class Ch3_2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		while(true) {
			int num = sc.nextInt();
			if (num==-1) {break;}
			sum += num;
			count ++;
		}
		double average = sum / count;
		
		System.out.printf("정수의 개수는 "+count+"개이며, 평균은 "+average+"입니다.");
		
	}
	

}
