class TV{
	String company;
	int year, inch;
	public TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	void show() {
		System.out.println(company+"���� ���� "+year+"���� "+inch+"��ġ TV"); 
	}
}
public class quiz_1 {
	public static void main(String[]args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
