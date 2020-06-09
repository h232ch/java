package singletone;

public class SingleTon {
	
	private static SingleTon singletone = new SingleTon();
	private SingleTon() {
		System.out.println("SingleTone Instance Created....");
	}
	
	public static SingleTon getInstance() { // 클래스 객체가 스태틱이기 때문에 해당 메서드도 반드시 스태틱이 되어야함
		// 스태틱이되지 않으면 오류가남!
		return singletone;
	}

}
