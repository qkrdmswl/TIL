package practice;
import java.util.Scanner;
import java.util.Arrays;
class Seat{ //좌석 객체 클래스
	public String seatName;
	int seatNum;
	public void seatNum(String name, int num) {
		this.seatName = name;
		this.seatNum = num;
	}
	public void view() {
		if
	}
}
public class Ch4_num12 {
	Seat S[] = new Seat[10];
	Seat A[] = new Seat[10];
	Seat B[] = new Seat[10];
	public void input(){
		Scanner sc = new Scanner(System.in);
		int seat, num;
		System.out.println("좌석구분 S(1), A(2), B(3)>>");
		seat = sc.nextInt();
		switch(seat) {
		case 1:
			S.view();
		}
	}
	public void view(Seat n[]) {
		for(int i=0; i<n.length; i++) {
			if(n[i] == null) {
				System.out.print("--- ");
			}else System.out.println(n[i].seatName);
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	public void cancel() {
		
	}
	public void finish() {
		
	}
	
	
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int service;
		Seat u = new Seat();
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4>>");
		service = sc.nextInt();
		switch(service){
		case 1:
			u = new input();
			break;
		case 2:
		}
	}
	
}
