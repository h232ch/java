package practice;

public class AdvancedLevel extends PlayerLevel{
	
	@Override
	protected void ment() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}
	@Override
	protected void run() {
		System.out.println("빨리 달립니다.");
	}

	
	@Override
	protected void turn() {
		System.out.println("Turn 할 줄 모르지롱");
	}

}
