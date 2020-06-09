package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;  // 컴파일시 static 변수가 붙어서 상수화 됨
	
	int add(int num1, int num2); // 컴파일시 static 변수가 붙어서 상수화 됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	public String stringAdd(String s1, String s2);
	
	// 함수의 이름 매개변수만 지정하는 것은 함수의 시그니처를 지정한다는 것
	// 이렇게 메서드를 선언할 것이라는 것은 해당 메서드가 어떻게 구현될 것인지에 대한 것을 알고있다는 것
	// 이것이 인터페이스 설계 과정임 , 인터페이스를 선언한다!
	
	default void description() { //디폴트 메서드
		System.out.println("정수 계산기를 구현합니다.");
		//myMethod(); JAVA9 부터 사용 가능
	}
	
	default void test(Calc i) { // 이러한 디폴트 메서드는 implements한 클래스를 이용하는 객체가 사용한다.
		
		System.out.println("test");
		i.description();
	}
	
	static int total(int[] arr) { //메서드를 static으로 상수화 시켜서 인터페이스 명으로 직접 사용하게 함
		int total = 0;
		
		for(int i: arr) {
			total +=i;
		}
		return total;
		//mystaticMethod(); //
	}
	
	/* private void myMethod() {  인터페이스 디폴트 메서드에서 사용
		System.out.println("private Method");
	}
	
	private static void mystaticMethod() {   스태틱 메서드에서 사용
		System.out.println("private static method");
	} JAVA VERSION 9 부터 사용가능*/ 
}
