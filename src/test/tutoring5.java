package test;
import java.util.Scanner;

public class tutoring5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 하나를 입력하세요>> ");
		char c = sc.next().charAt(0);
		
		for(char j=c; j >= 'a'; j--) {
			for(char i='a'; i <= j ; i++ ) {
			System.out.print(i);
			}
			System.out.println();
					
    }
}
}
