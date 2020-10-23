package practice;
abstract class PairMap{
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{
	int x;
	int i;
	String key, value;
	public Dictionary(int x){
		keyArray = new String[x];
		valueArray = new String[x];
	}
	public void put(String key, String value) { //put
		this.key = key;
		this.value = value;
		for(int i=0; i<keyArray.length; i++) {
			if(keyArray[i] != null) {
				if(key.equals(keyArray[i])) { 
					valueArray[i] = value;
					break;
				}else {  continue;  }
		}else {keyArray[i] = key; valueArray[i] = value; break;}
		}
	}
	public String get(String key) { //get
		int index = 0, j;
		this.key = key;
		for(j=0; j<keyArray.length; j++) {
			if(key.equals(keyArray[j])) {
				index = j;
				break;
			}
		}
		return valueArray[index];
	}
	public String delete(String key) { //delete
		this.key = key;
		int j;
		for(j=0; j<keyArray.length; j++) {
			if(key.equals(keyArray[j])) {
				keyArray[j] = null;	
				valueArray[j] = null;
				break;
			}else {}
		}return valueArray[j];
	}
	public int length() {
		return i;
	}
}
public class DictionaryApp {
	public static void main(String[]args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++" ); //���繮�� ��(value)�� C++�� ����
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����"); //Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}
}
