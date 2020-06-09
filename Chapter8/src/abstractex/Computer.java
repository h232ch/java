package abstractex;

public abstract class Computer { //Abstract를 사용하려면 클래스도 Abstract로 선언해야함
	
	public abstract void display();
	public abstract void type(); // 추상 메서드임 + 추상 메서드는 하위 클래스에서 사용 됨
	// 전원을 켜고 끄는것은 공통 메서드이지만, display, type은 모두 달라서 추상적으로만 만들어놓고 하위 클래스에서 구현하게 함
	// 델리게이션한다고도 함
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
