package practice;
import java.util.*;
public class Ch3_16 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String user;
		int n;

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.println("���� ���� ��!>> ");
			user = sc.next();
			if(user.equals("�׸�")) {System.out.println("������ �����մϴ�..."); break;}
			n = (int)(Math.random()*3);
		
			if((str[n].equals("����") && user.equals("��")) || 
					(str[n].equals("����") && user.equals("����")) ||
					(str[n].equals("��") && user.equals("����"))) {//����ڰ� �̱�� ���
				System.out.println("����� = "+user+" , ��ǻ�� = "+str[n]+" , ����ڰ� �̰���ϴ�.");			
			}else if((str[n].equals("����") && user.equals("����")) || 
					(str[n].equals("����") && user.equals("��")) ||
					(str[n].equals("��") && user.equals("����"))) {//����ڰ� ���� ���
				System.out.println("����� = "+user+" , ��ǻ�� = "+str[n]+" , ����ڰ� �����ϴ�.");	
			}else{//���� ���
				System.out.println("����� = "+user+" , ��ǻ�� = "+str[n]+" , ����ڰ� �����ϴ�.");
			
		    }
	    }
	}
}
