package practice;
import java.util.Scanner;

public class Ch3_num4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		char c = sc.next().charAt(0);
		
		for(char i=c; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
