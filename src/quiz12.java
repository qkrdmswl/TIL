import java.util.*;
public class quiz12 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		HashMap<String, String> r = new HashMap<String, String>();
		String name, grade, t = null;
		int score;
		double rate, sum=0;
		
		System.out.println("**JAVA 성적 관리 프로그램입니다**");
		while(true) {
			System.out.println("학생의 이름과 점수를 입력하세요>> ");
			name = sc.next();
			if(name.equals("끝")) {
				System.out.println("**프로그램 종료**");
				break;
				}
			
			score = sc.nextInt();
			sum += score;
			h.put(name, score);	
		}
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int value = h.get(key);
			
			rate = ((value*100) / sum);
			
			if(0< rate && rate <= 20) {
				grade = "A";
				r.put(key, grade);
			}
			else if(21 <= rate && rate <= 50) {
				grade = "B";
				r.put(key, grade);
			}
			else if(51 <= rate && rate <= 70) {
				grade = "C";
				r.put(key, grade);
			}
			else if(71 <= rate && rate <= 90) {
				grade = "D";
				r.put(key, grade);
			}
			else if(91 <= rate && rate <= 100) {
				grade = "F";
				r.put(key, grade);
			}	
		}
		
		System.out.println("**JAVA 성적 입니다**");
		
		Set<String> keys2 = r.keySet();
		Iterator<String> it2 = keys2.iterator();
		while(it2.hasNext()) {
			String key = it2.next();
			String value = r.get(key);
			
			System.out.println(key+" "+value);
		}	
	}

}
