import java.util.*;
public class hw9 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ӵ��� �Է��ϼ��� : ");
		String proverb = sc.nextLine();
		StringTokenizer st = new StringTokenizer(proverb);
		
		int n = st.countTokens();
		System.out.println("�ܾ� ����: "+n);
		
		System.out.println("���ĵ� ��ū: ");
		
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
