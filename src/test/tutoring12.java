package test;
import java.util.*;
public class tutoring12 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> h = new HashMap<String, Location>();
		String country;
		int lat, lon;
		
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.println(">>");
			country = sc.next();
			lat = sc.nextInt();
			lon = sc.nextInt(); 
			
			Location L = new Location(country, lat, lon);
			h.put(country, L);
		}
		//
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.println("------------------------------");
		while(it.hasNext()) {
			String key = it.next();
			Location value = h.get(key);
			System.out.println(key+" "+value);
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.println("���� �̸� >> ");
			country = sc.next();
			if (country.equals("�׸�")) {break;}
			else if (h.containsKey(country)) {
				System.out.println(country+" "+h.get(country));
			}
			else {System.out.println(country+"�� �����ϴ�.");
			}
		}

}
}
class Location{
	String country;
	int lat, lon;
	public Location(String country, int lat, int lon) {
		this.country = country;
		this.lat = lat;
		this.lon = lon;
	}
	void view() {
		System.out.println(lat+" "+lon);
	}
}