package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class tutoring15 {
	public static void main(String[]args) throws FileNotFoundException, UnsupportedEncodingException {
		String name, tel;
		HashMap<String, String> h = new HashMap<String, String>();
		String filePath;
		Scanner fScan = new Scanner(new InputStreamReader(new FileInputStream("c:\\temp\\phone.txt"),"UTF8"));
		
		
		while(fScan.hasNext()) {
			name = fScan.next();
			tel = fScan.next();
			
			h.put(name, tel);
		}
		fScan.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� 7���� ��ȭ��ȣ�� �о����ϴ�.");
		while(true) {
			System.out.println("�̸�>> ");
			name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(h.containsKey(name)) {
				tel = h.get(name);
				System.out.println(tel);
			}
			else {
				System.out.println("ã�� �� ���� �̸��Դϴ�.");
			}
		}
	}
}
