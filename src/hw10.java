import java.util.*;
public class hw10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		int choice, price, point, purchase, leftPoint, maxPoint = 0;
		String name, vip = null;
		
		
		while(true) {
			System.out.println("**����Ʈ ���� ���α׷��Դϴ�**");
			System.out.println("**1: ����Ʈ ����");
			System.out.println("**2: ����Ʈ ��ȸ");
			System.out.println("**3: ����Ʈ ����");
			System.out.println("**4: �ֿ�� �� �˸�");
			System.out.println("**5: ����");
			System.out.println("**����: ");
			choice = sc.nextInt();
			
			if(choice == 5) {
				System.out.println("MJ����Ʈ ���� ���α׷� ���� ����");
				break;
			}
			
			switch(choice) {
			case 1: 
				System.out.println("�̸��� ���űݾ� �Է�>> ");
				name = sc.next();
				if (name.equals("�׸�")) {break;}
				price = sc.nextInt();
				point = (int) (price * 0.1);
				
				if(h.containsKey(name)) {
					point = h.get(name) + point;
				}
				h.put(name, point);
				break;
				
			case 2:
				System.out.println("�̸�>> ");
				name = sc.next();
				if(h.containsKey(name)) {
					System.out.println("����Ʈ: "+h.get(name));}
				else { System.out.println("��ϵ��� ���� ���Դϴ�.");}
				break;
				
			case 3:
				System.out.println("�̸�>> ");
				name = sc.next();
				if(h.containsKey(name)) {
					System.out.println("��ǰ����>> ");
					price = sc.nextInt();
					
					point = h.get(name);
					if(point==0) {System.out.println("��밡���� ����Ʈ�� �����ϴ�.");}
					purchase = price - point;  
					System.out.println("�����Ҿ�: "+purchase);
					System.out.println("�ܿ�����Ʈ: 0");
				}else {System.out.println("��ϵ��� ���� ���Դϴ�.");}
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
				System.out.println("�ֿ�� ��>> "+vip);
				break;
			}
		}
		
	}

}
