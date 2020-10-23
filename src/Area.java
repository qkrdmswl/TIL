import java.util.Scanner;

public class Area {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��ϼ���(�ﰢ��, ��, �簢��, ������, ��ٸ���): ");
		String shape = scanner.nextLine();
		double area = 0;
		switch (shape) {
		    case "�ﰢ��":
		    	System.out.print("�غ��� �Է��ϼ���: ");
		    	double triangleWidth = scanner.nextDouble();
		    	
		    	System.out.print("���̸� �Է��ϼ���: ");
		    	double triangleHeight = scanner.nextDouble();
		    	
		    	area = triangleWidth * triangleHeight / 2;
		    	break;
		    	
			case "��":
				System.out.print("�������� �Է��ϼ���: ");
				double radius = scanner.nextDouble();
				
				area = radius*radius*3.14;
				break;
			
			case "�簢��":
				System.out.print("�غ��� ���̸� �Է��ϼ���: ");
				double squareWidth = scanner.nextDouble();
				
				System.out.print("���̸� �Է��ϼ���: ");
				double squareHeight = scanner.nextDouble();
				
				area = squareWidth * squareHeight;
				break;
				
			case "������":
				System.out.print("�� �밢���� ���̸� �Է��ϼ���: ");
				double diagonal1 = scanner.nextDouble();
				
				System.out.print("�ٸ� �밢���� ���̸� �Է��ϼ���: ");
				double diagonal2 = scanner.nextDouble();
				
				area = diagonal1 * diagonal2 / 2 ;
				break;
				
			case "��ٸ���":
				System.out.print("�غ��� ���̸� �Է��ϼ���: ");
				double bottomWidth = scanner.nextDouble();
				
				System.out.print("������ ���̸� �Է��ϼ���: ");
				double upperWidth = scanner.nextDouble();
				
				System.out.print("���̸� �Է��ϼ���: ");
				double height = scanner.nextDouble();
				
				area = (bottomWidth + upperWidth) * height / 2 ;
				break;
			}
		System.out.println(shape + "�� ���̴� " + area + "�Դϴ�.");
			
		scanner.close();
	}
}
