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
		
		System.out.println("������ �Է��ϼ���.");
		try {
			while(true) {
				System.out.println("����� : ");
				String subject = scanner.next();
				if (subject.equals("�׸�")) {
					try {
						average = sum / (scores.length);
					}
					catch(ArithmeticException e) {
						System.out.println("������� �Է��ϼ���.");
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
				
				System.out.println("�������� : ");
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
		System.out.printf("�Էµ� ������� ��� ���� : %d\n", average);
		
		while(true) {
			System.out.println("��ȸ�� �����̸��� �Է��ϼ���.");
			System.out.println("����� : ");
			String subjectSearch = scanner.next();
			if(subjectSearch.equals("�׸�")) {
				break;
			}
			for(int j=0; j < subjects.length; j++ ) {
				if (subjectSearch.equals(subjects[j])){
					System.out.println(subjectSearch + "�� ������ "+ scores[j]);
					break;
				}
				else if (j == subjects.length-1) {
					System.out.println("�ش� ������ �����ϴ�.");
					break;
				}
			}
        }
    }
}
