package practice;
import java.util.*;

public class Ch3_7 { //양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int Array[] = new int[5];
		
		for(int i=0; i<Array.length; i++ ) {
			int num = sc.nextInt();
			Array[i] = num;
		}
		for(int i=0; i<Array.length; i++) {
			if(Array[i-1]<Array[i]) {
				
			}
		}
   }

}
