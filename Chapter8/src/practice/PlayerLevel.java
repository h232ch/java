package practice;

public abstract class PlayerLevel {
	
	abstract protected void ment();
	abstract protected void run();
	protected void jump(int numOfJump){
		for(int i=0;i<numOfJump;i++) { // �߻� Ŭ������ �������� ����ϴ� �޼���� �����Ҽ��ִ�.
			System.out.println("���� jump �մϴ�.");
		}
	}
	abstract protected void turn();
	
	final public void go(int numOfJump) {
		run();
		jump(numOfJump);
		turn();
	}
}
