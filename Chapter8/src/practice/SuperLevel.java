package practice;

public class SuperLevel extends PlayerLevel{
	@Override
	protected void ment() {
		System.out.println("***** 고급자 레벨입니다. *****");
	}
	@Override
	protected void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	protected void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

}
