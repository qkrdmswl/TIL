package practice;

public class Ch3_1 {
	//¿¹Á¦ 3-1
	public static void main(String[]args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			if (i==10) {
				System.out.print(i+"=");
				sum += i;
			}
			else{
				System.out.print(i+"+");
				sum += i;
			}
		}
		System.out.print(sum);
	}
	
	

}
