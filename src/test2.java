import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("과목명 : ");
			String subject = sc.next();
			if(subject == "그만") {
				break;
			}
			System.out.println(subject);
			
			System.out.println("과목점수 : ");
			int score = sc.nextInt();
			System.out.println(score);
		}

	}

}
