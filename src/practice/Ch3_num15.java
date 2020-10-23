package practice;
import java.util.*;
public class Ch3_num15 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		while(true) {
			try {
				System.out.println("곱하고자 하는 두 수 입력>> ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1+"x"+n2+"="+n1*n2);
				break;
			}catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
				continue;
		  }
	   }
		sc.close();
    }
}
