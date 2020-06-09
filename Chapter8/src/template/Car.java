package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다..");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다..");
	}
	
	//public abstract void washCar(); 모든 하위 차 클래스에서 해당 기능을 구현해야 함
	public void washCar() {} //특정한 차만 해당 기능을 수행해야할때 이러한 훅메서드를 사용한다. 참중요
	final public void run() { //순서는 변경되면 안됨 -> final로 정의하여 변경이 안되게함 -> 이것을 template method라고 함
		startCar();
		drive();
		stop();
		turnOff();
		washCar(); // 훅메서드라고 함.. 아무 기능이 없음.. 하위 클래스에서 재정의 하면 기능이 추가됨
		// 이러한 패턴을 템플릿 메서드 패턴이라고 함
	}

}
