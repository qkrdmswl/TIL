package test;
import java.util.Scanner;

public class tutoring3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99������ ������ �Է��ϼ��� >> ");
		int num = sc.nextInt();
		int value;
		
		int ten = num/10;
		int one = num%10;
		
		if((ten==3)||(ten == 6)||(ten==9)) {
			if(one%3 == 0) {
				value = 2;
			}
			else {value = 1;}
		}else {
			if (one%3 == 0) {
				value = 1;
			}
			else {value = 0;}
		}
		
		if(value == 2) {System.out.println("�ڼ�¦¦");}
		else if(value == 1) {System.out.println("�ڼ�¦");}
		else {}
		
		
	}

}
