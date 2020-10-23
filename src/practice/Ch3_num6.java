package practice;
import java.util.Arrays;
import java.util.Scanner;
public class Ch3_num6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		System.out.println("금액을 입력하시오>> ");
		int num = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int q = num / unit[i] ;
			if ( q > 0) {
				System.out.println(unit[i]+"원 짜리 : "+q+"개");
				num -= unit[i]*q ;
			}
		}
	}

}
