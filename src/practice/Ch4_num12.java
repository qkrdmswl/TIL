package practice;
import java.util.Scanner;
import java.util.Arrays;
class Seat{ //�¼� ��ü Ŭ����
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
		System.out.println("�¼����� S(1), A(2), B(3)>>");
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
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	public void cancel() {
		
	}
	public void finish() {
		
	}
	
	
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int service;
		Seat u = new Seat();
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		System.out.println("����:1, ��ȸ:2, ���:3, ������:4>>");
		service = sc.nextInt();
		switch(service){
		case 1:
			u = new input();
			break;
		case 2:
		}
	}
	
}
