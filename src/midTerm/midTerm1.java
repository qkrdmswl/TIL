package midTerm;
import java.util.Scanner;
public class midTerm1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("���� ������ �Է��ϼ���: ");
			int num = sc.nextInt();
			if (num >0 ) {
				if (num % 2 == 0) {
					sum += num;
				}
				else {continue;}		
			}else {break;}
		} System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� "+sum);
		sc.close();
	}
}
