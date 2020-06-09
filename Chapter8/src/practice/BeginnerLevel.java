package practice;

public class BeginnerLevel extends PlayerLevel{

	@Override
	protected void ment() {
		System.out.println("***** 초급자 레벨입니다. *****");
	}
	@Override
	protected void run() {
		System.out.println("천천히 달립니다.");
	}

	
	@Override
	protected void turn() {
		System.out.println("Turn할 줄 모르지롱");
	}

}
