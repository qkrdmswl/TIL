package practice;

public class Ch3_4 { //구구단 출력하기
	public static void main(String[]args) {
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}

}
