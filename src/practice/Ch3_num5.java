package practice;
import java.util.*;

public class Ch3_num5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�>> ");
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.print("3�� ����� ");
		
		for(int j=0; j<arr.length; j++) {
			if (arr[j] % 3 == 0) {
				System.out.print(arr[j]+" ");
			}
		}
	}
}
