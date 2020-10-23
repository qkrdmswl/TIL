import java.util.Scanner;

public class Area {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원하는 도형을 입력하세요(삼각형, 원, 사각형, 마름모, 사다리꼴): ");
		String shape = scanner.nextLine();
		double area = 0;
		switch (shape) {
		    case "삼각형":
		    	System.out.print("밑변을 입력하세요: ");
		    	double triangleWidth = scanner.nextDouble();
		    	
		    	System.out.print("높이를 입력하세요: ");
		    	double triangleHeight = scanner.nextDouble();
		    	
		    	area = triangleWidth * triangleHeight / 2;
		    	break;
		    	
			case "원":
				System.out.print("반지름을 입력하세요: ");
				double radius = scanner.nextDouble();
				
				area = radius*radius*3.14;
				break;
			
			case "사각형":
				System.out.print("밑변의 길이를 입력하세요: ");
				double squareWidth = scanner.nextDouble();
				
				System.out.print("높이를 입력하세요: ");
				double squareHeight = scanner.nextDouble();
				
				area = squareWidth * squareHeight;
				break;
				
			case "마름모":
				System.out.print("한 대각선의 길이를 입력하세요: ");
				double diagonal1 = scanner.nextDouble();
				
				System.out.print("다른 대각선의 길이를 입력하세요: ");
				double diagonal2 = scanner.nextDouble();
				
				area = diagonal1 * diagonal2 / 2 ;
				break;
				
			case "사다리꼴":
				System.out.print("밑변의 길이를 입력하세요: ");
				double bottomWidth = scanner.nextDouble();
				
				System.out.print("윗변의 길이를 입력하세요: ");
				double upperWidth = scanner.nextDouble();
				
				System.out.print("높이를 입력하세요: ");
				double height = scanner.nextDouble();
				
				area = (bottomWidth + upperWidth) * height / 2 ;
				break;
			}
		System.out.println(shape + "의 넓이는 " + area + "입니다.");
			
		scanner.close();
	}
}
