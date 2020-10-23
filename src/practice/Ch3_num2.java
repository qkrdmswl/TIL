package practice;

public class Ch3_num2 {// 실습문제 2번
	public static void main(String[]args) {
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
	}

}
