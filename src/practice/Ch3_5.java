package practice;
import java.util.Scanner;

public class Ch3_5 { //continue ����Ͽ� ��� �� ���ϱ�
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		
		System.out.println("���� 5���� �Է��ϼ���.");
		
		for(int i=0; i<5; i++) {
			num = sc.nextInt();
			if(num <= 0) {continue;}
			else {sum += num;}
		}
		System.out.println(sum);
	}

}
