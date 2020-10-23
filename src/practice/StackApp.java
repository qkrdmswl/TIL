package practice;
import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
	
class StringStack implements Stack{
	private String[] element;
	private int tos;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}
	@Override
	public int length() {
		return tos + 1; 
	}
	@Override
	public int capacity() {
		return element.length;
	}
	@Override
	public String pop() {
		if (tos == -1) return null;
		String s = element[tos];
		tos--;
		return s;
	}
	@Override
	public boolean push(String str) {
		if (tos == element.length - 1)
		return false;
		else {
			tos ++;
			element[tos] = str;
			return true;
		}
	}
}
public class StackApp{	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���� ������ ũ�� �Է� >> ");
		int n = sc.nextInt();
		StringStack s = new StringStack(n);
		
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = sc.next();
			if (str.equals("�׸�")) { break;}
			boolean res = s.push(str);
			if (res == false){ System.out.println("������ �� ���� Ǫ�� �Ұ�!");}
		}
		System.out.println("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = s.length();
		for (int i=0; i<len; i++) {
			System.out.println(s.pop() + " ");
		}
		
		sc.close();
	}
}
