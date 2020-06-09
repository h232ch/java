package practice;

public abstract class PlayerLevel {
	
	abstract protected void ment();
	abstract protected void run();
	protected void jump(int numOfJump){
		for(int i=0;i<numOfJump;i++) { // 추상 클래스도 공통으로 사용하는 메서드는 정의할수있다.
			System.out.println("높이 jump 합니다.");
		}
	}
	abstract protected void turn();
	
	final public void go(int numOfJump) {
		run();
		jump(numOfJump);
		turn();
	}
}
