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
		System.out.println("인원수>>");
		int num = sc.nextInt();
		
		Phone p [] = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			name = sc.next();
			tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		//검색
		while(true) {
			System.out.println("검색할 이름>>");
			String searchName = sc.next();
			if(searchName.equals("그만")) break;
			for(int i=0; i<num; i++) {
				if(p[i].name.equals(searchName)) {
					System.out.println(p[i].name+"의 번호는 "+p[i].tel+" 입니다.");
				}
				else System.out.println(searchName+"이(는) 없습니다.");
			}
		}
	}
}
