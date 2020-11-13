import java.io.*;
import java.util.Scanner;

public class hw11 {
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String s1 = sc.nextLine();
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
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
		System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");

		sc.close();
	}
}
