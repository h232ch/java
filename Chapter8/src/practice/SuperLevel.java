package practice;

public class SuperLevel extends PlayerLevel{
	@Override
	protected void ment() {
		System.out.println("***** ����� �����Դϴ�. *****");
	}
	@Override
	protected void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}

}
