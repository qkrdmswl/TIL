package test;
import java.util.Scanner;
public class tutoring2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int result;
		
		System.out.println("���� 3�� �Է� >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(((a>b)&&(b>c))||((c>b)&&(b>a))) {
			result = b;
		}else if(((b>a)&&(a>c))||((c>a)&&(a>b))) {
			result = a;
		}else {result = c;}
		
		
		System.out.print(">> ");
		System.out.println(result);
	}

}
