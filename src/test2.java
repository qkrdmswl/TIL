import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("����� : ");
			String subject = sc.next();
			if(subject == "�׸�") {
				break;
			}
			System.out.println(subject);
			
			System.out.println("�������� : ");
			int score = sc.nextInt();
			System.out.println(score);
		}

	}

}
