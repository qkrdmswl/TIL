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
		System.out.println("총 7개의 전화번호를 읽었습니다.");
		while(true) {
			System.out.println("이름>> ");
			name = sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(h.containsKey(name)) {
				tel = h.get(name);
				System.out.println(tel);
			}
			else {
				System.out.println("찾을 수 없는 이름입니다.");
			}
		}
	}
}
