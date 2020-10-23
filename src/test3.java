import java.util.*;

public class test3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String subjects[] = new String[3];
		
		for(int i=0; i < 3 ; i++) {
			System.out.println("°ú¸ñ¸í : ");
			String subject = sc.next();	
			
			subjects[i] = subject;
		}
		System.out.println(Arrays.toString(subjects));
		
		
		
	}

}
