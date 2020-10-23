package midTerm;
import java.util.Scanner;
public class midTerm1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("양의 정수를 입력하세요: ");
			int num = sc.nextInt();
			if (num >0 ) {
				if (num % 2 == 0) {
					sum += num;
				}
				else {continue;}		
			}else {break;}
		} System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
		sc.close();
	}
}
