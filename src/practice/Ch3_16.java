package practice;
import java.util.*;
public class Ch3_16 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String user;
		int n;

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.println("가위 바위 보!>> ");
			user = sc.next();
			if(user.equals("그만")) {System.out.println("게임을 종료합니다..."); break;}
			n = (int)(Math.random()*3);
		
			if((str[n].equals("바위") && user.equals("보")) || 
					(str[n].equals("가위") && user.equals("바위")) ||
					(str[n].equals("보") && user.equals("가위"))) {//사용자가 이기는 경우
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+" , 사용자가 이겼습니다.");			
			}else if((str[n].equals("바위") && user.equals("가위")) || 
					(str[n].equals("가위") && user.equals("보")) ||
					(str[n].equals("보") && user.equals("바위"))) {//사용자가 지는 경우
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+" , 사용자가 졌습니다.");	
			}else{//비기는 경우
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+" , 사용자가 비겼습니다.");
			
		    }
	    }
	}
}
