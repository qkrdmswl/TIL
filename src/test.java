import java.util.Scanner;

public class test {
	public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
		
		String subjects[] = new String[5];
		int scores[] = new int[5];
		int sum = 0;
		int average;
		
		
		for(int i=0; i < 5 ; i++) {
			System.out.println("����� : ");               //����� �Է¹ޱ�
			String subjectName = scanner.nextLine();
			if(subjectName == "�׸�") {
				break;
			}
			subjects[i] = subjectName;                   //����� �����ϱ�
				
			System.out.println("�������� : ");             //�������� �Է¹ޱ�
			int subjectScore = scanner.nextInt();
			scores[i] = subjectScore;                   //�������� �����ϱ�
				
			sum += scores[i];
			
		   }
	}

}
