package practice;
import java.util.Scanner;

class Phone{
	String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}
public class Ch4_num8 { //PhoneBook class
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String name, tel;
		System.out.println("�ο���>>");
		int num = sc.nextInt();
		
		Phone p [] = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			name = sc.next();
			tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		//�˻�
		while(true) {
			System.out.println("�˻��� �̸�>>");
			String searchName = sc.next();
			if(searchName.equals("�׸�")) break;
			for(int i=0; i<num; i++) {
				if(p[i].name.equals(searchName)) {
					System.out.println(p[i].name+"�� ��ȣ�� "+p[i].tel+" �Դϴ�.");
				}
				else System.out.println(searchName+"��(��) �����ϴ�.");
			}
		}
	}
}
