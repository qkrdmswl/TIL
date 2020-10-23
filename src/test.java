import java.util.Scanner;

public class test {
	public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
		
		String subjects[] = new String[5];
		int scores[] = new int[5];
		int sum = 0;
		int average;
		
		
		for(int i=0; i < 5 ; i++) {
			System.out.println("과목명 : ");               //과목명 입력받기
			String subjectName = scanner.nextLine();
			if(subjectName == "그만") {
				break;
			}
			subjects[i] = subjectName;                   //과목명 저장하기
				
			System.out.println("과목점수 : ");             //과목점수 입력받기
			int subjectScore = scanner.nextInt();
			scores[i] = subjectScore;                   //과목점수 저장하기
				
			sum += scores[i];
			
		   }
	}

}
