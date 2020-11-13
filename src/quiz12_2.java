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
		
		System.out.println("**Java 성적 파일 이름을 입력하세요 : ");
		fileName = sc.next();
		
		Scanner fScanner = new Scanner(new FileReader(fileName));
		System.out.println("총 20명 학생의 Java 성적을 읽었습니다.");
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
			grade = line + " " + (i+1)+"등";
			v2.add(i, grade);
			fout.write(grade, 0, grade.length());
			fout.write("/n", 0, 2);
		}
		fout.close();
		
		while(true) {
			System.out.println("**학생의 이름을 입력하세요: ");
			name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			for(int i=0; i<v.size(); i++) {
				if(v.contains(name)) {
					System.out.println(v.get(i)+"점 "+v2.get(i)+"등");
					break;
				}else {
					System.out.println("찾을 수 없는 이름입니다.");
					break;
				}
				
			}
		}
	}		
}



