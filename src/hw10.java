import java.util.*;
public class hw10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		int choice, price, point, purchase, leftPoint, maxPoint = 0;
		String name, vip = null;
		
		
		while(true) {
			System.out.println("**포인트 관리 프로그램입니다**");
			System.out.println("**1: 포인트 적립");
			System.out.println("**2: 포인트 조회");
			System.out.println("**3: 포인트 차감");
			System.out.println("**4: 최우수 고객 알림");
			System.out.println("**5: 종료");
			System.out.println("**선택: ");
			choice = sc.nextInt();
			
			if(choice == 5) {
				System.out.println("MJ포인트 관리 프로그램 정상 종료");
				break;
			}
			
			switch(choice) {
			case 1: 
				System.out.println("이름과 구매금액 입력>> ");
				name = sc.next();
				if (name.equals("그만")) {break;}
				price = sc.nextInt();
				point = (int) (price * 0.1);
				
				if(h.containsKey(name)) {
					point = h.get(name) + point;
				}
				h.put(name, point);
				break;
				
			case 2:
				System.out.println("이름>> ");
				name = sc.next();
				if(h.containsKey(name)) {
					System.out.println("포인트: "+h.get(name));}
				else { System.out.println("등록되지 않은 고객입니다.");}
				break;
				
			case 3:
				System.out.println("이름>> ");
				name = sc.next();
				if(h.containsKey(name)) {
					System.out.println("상품가격>> ");
					price = sc.nextInt();
					
					point = h.get(name);
					if(point==0) {System.out.println("사용가능한 포인트가 없습니다.");}
					purchase = price - point;  
					System.out.println("실지불액: "+purchase);
					System.out.println("잔여포인트: 0");
				}else {System.out.println("등록되지 않은 고객입니다.");}
				break;
			
			case 4:
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key = it.next();
					int value = h.get(key);
					if(maxPoint <= value) {
						maxPoint = value;
						vip = key;
					}else {
						maxPoint = maxPoint;
					}	
				}
				System.out.println("최우수 고객>> "+vip);
				break;
			}
		}
		
	}

}
