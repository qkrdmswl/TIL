package test;
import java.util.*;

class ScannerClass{
	int first=0;
	int second=0;
	public ScannerClass(int num) {}
	void setValue(int num) {
		if(first <= num) {
			this.second = first;
			this.first = num;
	  }else if (second <= num){
		  this.first = first;
		  this.second = num;
	  }
	}
	int resultFirst() {
		return this.first;
	}
	int resultSecond() {
		return this.second;
	}

}
public class QuizNum2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum =0;
		int secondNum = 0;
		System.out.println("정수를 입력하세요: ");
		ScannerClass sc = new ScannerClass(0);
		
		while(true) {
		int num = scanner.nextInt();
		sc.setValue(num);
		if (num==0) {break;}
				 
		firstNum = sc.resultFirst();
		secondNum = sc.resultSecond();
		}
		System.out.println(firstNum);
		System.out.println(secondNum);
	}

}
