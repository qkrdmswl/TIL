package test;
import java.util.*;
public class tutoring12 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> h = new HashMap<String, Location>();
		String country;
		int lat, lon;
		
		System.out.println("도시,경도,위도를 입력하세요.");
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
			System.out.println("도시 이름 >> ");
			country = sc.next();
			if (country.equals("그만")) {break;}
			else if (h.containsKey(country)) {
				System.out.println(country+" "+h.get(country));
			}
			else {System.out.println(country+"는 없습니다.");
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