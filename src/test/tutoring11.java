package test;
import java.util.*;
public class tutoring11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	    String name = null;
		int point;
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		while(true) {
			System.out.println("�̸��� ����Ʈ �Է�>> ");
			name = sc.next();
			if (name.equals("�׸�")) {break;}
			point = sc.nextInt();
			if (h.containsKey(name)) {
				point = h.get(name) + point;
			}
			h.put(name, point);
			
			for(int i=0; i<h.size(); i++) {
				System.out.print("("+name+","+h.get(name)+") ");
			}
			System.out.println();
		}
	}
}
