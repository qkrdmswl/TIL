import java.util.*;

//클래스 만들기
class Add{
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a + b;
	}
}
class Sub{
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a - b;
	}
}
class Mul{
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a * b;
	}
}
class Div{
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a / b;
	}
}
class Rem{
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a % b;
	}
}
// main 함수 실행
public class hw4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.println("두 정수와 연산자를 입력하시오 >> ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		op = scanner.next().charAt(0);
		
		switch(op) {
		case '+':
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.calculate());
			break;
		case '%':
			Rem rem = new Rem();
			rem.setValue(num1, num2);
			System.out.println(rem.calculate());
			break;
		}	
		scanner.close();
	}
}
