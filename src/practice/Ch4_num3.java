package practice;
class Song{
	String title, artist, country;
	int year;
	public Song() {}
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	void show(){
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
}
public class Ch4_num3 {
	public static void main(String[]args) {
		Song mySong = new Song(1978,"������","ABBA","Dancing Queen");
		mySong.show();
	}

}
