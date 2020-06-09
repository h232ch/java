package lamda;

@FunctionalInterface
interface PrintString{
	void showString(String str);
}

class printString2 implements PrintString{

	@Override
	public void showString(String str) {
		System.out.println("printString2 : "+str);
	}
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdaStr = s->System.out.println(s); //함수의 구현부가 변수에 바로 대입되는
		lambdaStr.showString("test");
		
		printString2 lam2 = new printString2(); //람다는 별도로 printString 인터페이스를 참조하거나하는 클래스를 안만들어도됨
		lam2.showString("test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("test3");
		
	}
	
	public static void showMyString(PrintString p) { //printString 구현부는 main클래스에 있음 자바스크립트에서는 이런부분이 많음
		p.showString("test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + "!!!");
	}

}
