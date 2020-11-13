import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class quiz12_2 {
	public static void main(String[]args) throws IOException {
		Vector<String> v = new Vector<String>();
		Vector<String> v2 = new Vector<String>();
		Scanner sc = new Scanner(System.in);
		String fileName, name;
		int score;
		String grade;
		
		System.out.println("**Java ���� ���� �̸��� �Է��ϼ��� : ");
		fileName = sc.next();
		
		Scanner fScanner = new Scanner(new FileReader(fileName));
		System.out.println("�� 20�� �л��� Java ������ �о����ϴ�.");
		while(fScanner.hasNext()) {
			String line = fScanner.nextLine();
			v.add(line);
		}
		
		Collections.sort(v);
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		FileWriter fout = new FileWriter("c:\\Temp\\java2.txt");
		for(int i=0; i<v.size(); i++) {
			String line = v.get(i);
			grade = line + " " + (i+1)+"��";
			v2.add(i, grade);
			fout.write(grade, 0, grade.length());
			fout.write("/n", 0, 2);
		}
		fout.close();
		
		while(true) {
			System.out.println("**�л��� �̸��� �Է��ϼ���: ");
			name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			for(int i=0; i<v.size(); i++) {
				if(v.contains(name)) {
					System.out.println(v.get(i)+"�� "+v2.get(i)+"��");
					break;
				}else {
					System.out.println("ã�� �� ���� �̸��Դϴ�.");
					break;
				}
				
			}
		}
	}		
}



