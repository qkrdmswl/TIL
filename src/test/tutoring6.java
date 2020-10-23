package test;
import java.util.*;

public class tutoring6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 몇 개? ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					continue;
				}else {continue;}
			}
		}
		for(int i=0; i<num; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
			
		}
	}

}
