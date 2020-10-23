package practice;
class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() { 
		return size;
	}
}
public class ColorTV extends TV{ //에러 원인 모름
	private int nColors;
	public ColorTV(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+nColors+"컬러");
	}
}
public class IPTV extends ColorTV{
	String adress;
	public IPTV(String adress, int size, int nColors) {
		super(size, nColors);
		this.adress = adress;
	}
}
public class Ch5_num1 { // + num2
	public static void main(String[]args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
