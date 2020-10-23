package midTerm;
import java.util.Arrays;
import java.util.Scanner;
public class midTerm2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, num;
		boolean val1= false , val2 = false, val3=false, val4=false;
		int magicSquare[][] = new int[3][3]; 
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("숫자를 입력하세요: ");
				num = sc.nextInt();
				magicSquare[i][j] = num;
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += magicSquare[i][j];
			}
			if (sum == 15) { val1 = true;}
			else {val1 = false;}
			sum = 0;
		}System.out.println(val1);
		
		for(int j=0; j <3; j++) {
			for(int i=0; i<3; i++) {
				sum += magicSquare[i][j];
			}if (sum == 15) { val2 = true;}
			else {val2 = false;}
			sum=0;
		}System.out.println(val2);
		
		for(int i=0; i<3; i++) {
			for(i=0; i<3; i++) {
				sum += magicSquare[i][i];
			}
			if (sum == 15) {val3 = true; }
			else {val3 = false;}
			sum=0;
		}System.out.println(val3);
		
		for(int i=0; i<3; i++) {
			for(int j=2; j>=0; j--) {
				sum += magicSquare[i][j];
			}if(sum == 15) {val4 = true;}
			else {val4 = false;}
			sum=0;
		}System.out.println(val4);
		//검사
		if(val1 && val2 && val3 && val4) {
			System.out.println("마방진입니다.");
			}
		else {System.out.println("마방진이 아닙니다.");}
			
}
}
	

