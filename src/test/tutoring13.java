package test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class tutoring13 {
	public static void main(String[]args) throws FileNotFoundException {
		int num=0;
		Scanner fScan = new Scanner(new FileReader("c:\\windows\\system.ini"));
		System.out.println("c:\\\\windows\\\\system.ini ������ �о� ����մϴ�.");
		
		while(fScan.hasNext()) {
			num += 1;
			String line = fScan.nextLine();
			System.out.println(num+":"+" "+line);
		}
		
	}

}
