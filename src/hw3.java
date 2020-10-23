import java.util.Scanner;
import java.util.Arrays;

public class hw3 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String subjects[] = new String[0];
		int scores[] = new int[0];
		int sum = 0;
	    int average;
	    int i = 0;
		
		System.out.println("성적을 입력하세요.");
		try {
			while(true) {
				System.out.println("과목명 : ");
				String subject = scanner.next();
				if (subject.equals("그만")) {
					try {
						average = sum / (scores.length);
					}
					catch(ArithmeticException e) {
						System.out.println("과목명을 입력하세요.");
						continue;
					}
					break;
				}
				else {
					i++;
					String[] Array = (String[])Arrays.copyOf(subjects, i);
					Array[i-1] = subject;
					subjects = Array;
				}
				
				System.out.println("과목점수 : ");
				int score = scanner.nextInt();
				int[] scoreArray = Arrays.copyOf(scores, i);
				scoreArray[i-1] = score;
				scores = scoreArray;
			}
			for(i=0; i< scores.length; i++) {
				sum += scores[i];
			}
			average = sum / (scores.length);
		}finally {
			
		}
		System.out.printf("입력된 과목들의 평균 성적 : %d\n", average);
		
		while(true) {
			System.out.println("조회할 과목이름을 입력하세요.");
			System.out.println("과목명 : ");
			String subjectSearch = scanner.next();
			if(subjectSearch.equals("그만")) {
				break;
			}
			for(int j=0; j < subjects.length; j++ ) {
				if (subjectSearch.equals(subjects[j])){
					System.out.println(subjectSearch + "의 점수는 "+ scores[j]);
					break;
				}
				else if (j == subjects.length-1) {
					System.out.println("해당 과목은 없습니다.");
					break;
				}
			}
        }
    }
}
