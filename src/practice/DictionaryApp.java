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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++" ); //이재문의 값(value)를 C++로 수정
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		dic.delete("황기태"); //황기태 아이템 삭제
		System.out.println("황기태의 값은 "+dic.get("황기태"));
	}
}
