package test;
import java.util.Scanner;

public class QuizNum1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0, num, numCnt=0, printCnt=0;
		int cnt[] = new int[10];
		
		System.out.println("숫자를 10개 입력하세요 : ");
		while(true) {
			num = scanner.nextInt();
			
			if((num >= 0)&&(num <= 9)){ i=0; }
			else if((num >= 10)&&(num < 20)) { i=1; }
			else if((num >= 20)&&(num < 30)) { i=2;}
			else if((num >= 30)&&(num < 40)) { i=3;}
			else if((num >= 40)&&(num < 50)) { i=4;}
			else if((num >= 50)&&(num < 60)) { i=5;}
			else if((num >= 60)&&(num < 70)) { i=6;}
			else if((num >= 70)&&(num < 80)) { i=7;}
			else if((num >= 80)&&(num < 90)) { i=8;}
			else if((num >= 90)&&(num < 100)) { i=9;}
			
			cnt[i] ++;
			numCnt ++;
			
			if (numCnt == 10) {break;}
	}
		System.out.println("결과");
		for(i=0; i < num ; i++) {
			System.out.print(((i*10) +"~"+((i*10)+9)+": "));
			while(cnt[i]!=0) {
				System.out.print("*");
				cnt[i]--;
			}System.out.println();
		}		
}
}
