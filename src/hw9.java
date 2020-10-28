import java.util.*;
public class hw9 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("속담을 입력하세요 : ");
		String proverb = sc.nextLine();
		StringTokenizer st = new StringTokenizer(proverb);
		
		int n = st.countTokens();
		System.out.println("단어 개수: "+n);
		
		System.out.println("정렬된 토큰: ");
		
		String tokens[] = new String[n];
		for(int i=0; i<n; i++) {
			String token = st.nextToken();
			tokens[i] = token;
		}
		Arrays.sort(tokens);
		
		for(int i=0; i<n; i++) {
			if(i==n-1) {
				System.out.println(tokens[i]);
			}else {
				System.out.print(tokens[i]+", ");				
			}
		}
		
	}

}
