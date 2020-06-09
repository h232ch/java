package innerclass;

class OutClass{
	private int num=10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{ // 인스턴스 내부 클래스 OutClass$inClass.java
		int iNum = 100;
		// static int sInNum = 200; 오류 발생, static 클래스라면 static 변수 사용가능, 하지만 일반 메서드에 Static 변수를 사용할수 없음
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum =100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() { //static 클래스에서 static 메서드 , 변수 모두 만들수있다.
			//System.out.println(inNum); 스태틱 메서드에서는 일반 변수를 사용할 수 없음, 스태틱 변수는 생성과 상관없이 클래스 이름으로 사용할수 있어야함
			
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner(); // inClas 자체는 Private이라 즉시 사용 불가하고 메서드를 이용해야함
		OutClass.InClass myInClass = outClass.new InClass(); // inClass를 생성하기 위해 outClass 참조변수를 이용해서 new 할수 있음
		// 보통 인스턴스 inclass의 경우 private으로 만든다. 그리고 용도 자체가 클래스 내부에서만 사용하는것이라 위와같은 코딩은 하지 않음
		
		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); // 스태틱 메서드가 아니기때문에 inNum을 호출할 수 이따~
		OutClass.InStaticClass.sTest(); // 스태틱 메서드는 인스턴스 없이 바로 접근 가능하다! 중요
		sInClass.sTest(); // 스태틱이므로 클래스명으로 접근하라고 주의만 뜸
	}

}
