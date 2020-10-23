package practice;
import java.util.Scanner;

public class Ch3_5 { //continue 사용하여 양수 합 구하기
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		
		System.out.println("정수 5개를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			num = sc.nextInt();
			if(num <= 0) {continue;}
			else {sum += num;}
		}
		System.out.println(sum);
	}

}
