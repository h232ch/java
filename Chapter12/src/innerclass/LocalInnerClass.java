package innerclass;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // 메스드 내에 클래스 선언
		int num = 100; //지역변수, 메서드가 호출되고 끝날때까지 유효한것들 
		class MyRunnable implements Runnable{ // 지역 내부 클래스라고 함
			@Override
			public void run() { //런할때 실행할 태스크
				//num +=10; //MyRunnable 참조값을 반환하면서, 해당값은 계속 호출될수있기때문에 자동으로 static화 시켜버림 그래서 값을 변경하지 못함
				//기존대로라면 num값은 메서드 실행후 모두 사라지게됨
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				System.out.println(num);
			}
		}
		return new MyRunnable(); // 리턴을하고 나면 MyRunnable은 언제든지 사용가능하게 됨 그래서 지역변수를 상수화가되어버림 그래서, 참조는 할수있지만
		// 변경은 하지못함
	}
}

public class LocalInnerClass {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
