package practice;
import java.util.*;
public class Ch3_num15 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		while(true) {
			try {
				System.out.println("���ϰ��� �ϴ� �� �� �Է�>> ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1+"x"+n2+"="+n1*n2);
				break;
			}catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
				continue;
		  }
	   }
		sc.close();
    }
}
