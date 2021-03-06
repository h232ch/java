package innerclass;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { 
		int num = 100; 
		return new Runnable() { //익명 이너 클래스, 이름이없는 이너 클래스가 탄생! 클래스를 별도의 명으로 생성하지 않고 바로 실행함
			@Override
			public void run() { 
				//num+=10; 지역변수는 메서드 실행이 끝나면 소멸됨! 하지만 return을 생성자로 받기에 메소드가 종료된 후에도 계속 사용가능하기 때문에
				//자동으로 지역변수를 static화 시킴 그래서 수정이 불가능함 참조는 가능함
				System.out.println(num);
				System.out.println(outNum);
				System.out.println(Outer2.sNum);
				 
			}}; //리턴할때 Runnable을 직접 구현해서 값을 던짐
	}
	
	Runnable runner = new Runnable() { //자동생성 가능 어나니머스 이너 클래스!
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {
	
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run(); //익명 이너클래는 추상, 인터페이스 참조하는 이너 클래스를 바로 생성할 수 있음, 기존에는 참조 인스턴스변수를 만들고~ 했다면 이건 바로생성사용
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
