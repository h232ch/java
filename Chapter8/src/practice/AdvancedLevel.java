package practice;

public class AdvancedLevel extends PlayerLevel{
	
	@Override
	protected void ment() {
		System.out.println("***** �߱��� �����Դϴ�. *****");
	}
	@Override
	protected void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	
	@Override
	protected void turn() {
		System.out.println("Turn �� �� ������");
	}

}
