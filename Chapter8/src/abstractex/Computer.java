package abstractex;

public abstract class Computer { //Abstract�� ����Ϸ��� Ŭ������ Abstract�� �����ؾ���
	
	public abstract void display();
	public abstract void type(); // �߻� �޼����� + �߻� �޼���� ���� Ŭ�������� ��� ��
	// ������ �Ѱ� ���°��� ���� �޼���������, display, type�� ��� �޶� �߻������θ� �������� ���� Ŭ�������� �����ϰ� ��
	// �������̼��Ѵٰ� ��
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
