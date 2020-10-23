import java.util.Scanner;

public class test5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int num,i,j;
		
		System.out.println("정수를 입력하시오 >> ");
		num = scanner.nextInt();
		
		for(i=1; i< num+1; i++) {
			for(j=1 ; j < num+2-i; j++  ) {
				System.out.print("*");
			}
			System.out.println("");
		} scanner.close();
	}
}

