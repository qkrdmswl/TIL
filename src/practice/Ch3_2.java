package practice;
import java.util.Scanner;

public class Ch3_2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		while(true) {
			int num = sc.nextInt();
			if (num==-1) {break;}
			sum += num;
			count ++;
		}
		double average = sum / count;
		
		System.out.printf("������ ������ "+count+"���̸�, ����� "+average+"�Դϴ�.");
		
	}
	

}
