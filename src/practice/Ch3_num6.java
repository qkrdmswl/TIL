package practice;
import java.util.Arrays;
import java.util.Scanner;
public class Ch3_num6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		System.out.println("�ݾ��� �Է��Ͻÿ�>> ");
		int num = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int q = num / unit[i] ;
			if ( q > 0) {
				System.out.println(unit[i]+"�� ¥�� : "+q+"��");
				num -= unit[i]*q ;
			}
		}
	}

}
