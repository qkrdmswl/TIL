package test;
import java.util.Scanner;

public class tutoring5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ� �ϳ��� �Է��ϼ���>> ");
		char c = sc.next().charAt(0);
		
		for(char j=c; j >= 'a'; j--) {
			for(char i='a'; i <= j ; i++ ) {
			System.out.print(i);
			}
			System.out.println();
					
    }
}
}
