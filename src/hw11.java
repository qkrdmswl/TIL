import java.io.*;
import java.util.Scanner;

public class hw11 {
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String s1 = sc.nextLine();
		
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String s2 = sc.nextLine();
		
		int c;
		fr = new FileReader(s1);
		fw = new FileWriter("appended.txt", true);
		while((c=fr.read())!=-1) {
			fw.write((char)c);
		}
		fr = new FileReader(s2);
		while((c=fr.read())!=-1) {
			fw.write((char)c);
		}
		fr.close();
		fw.close();
		System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");

		sc.close();
	}
}
