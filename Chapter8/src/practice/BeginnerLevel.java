package practice;

public class BeginnerLevel extends PlayerLevel{

	@Override
	protected void ment() {
		System.out.println("***** �ʱ��� �����Դϴ�. *****");
	}
	@Override
	protected void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	
	@Override
	protected void turn() {
		System.out.println("Turn�� �� ������");
	}

}
