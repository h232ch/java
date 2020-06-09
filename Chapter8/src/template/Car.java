package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�..");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�..");
	}
	
	//public abstract void washCar(); ��� ���� �� Ŭ�������� �ش� ����� �����ؾ� ��
	public void washCar() {} //Ư���� ���� �ش� ����� �����ؾ��Ҷ� �̷��� �Ÿ޼��带 ����Ѵ�. ���߿�
	final public void run() { //������ ����Ǹ� �ȵ� -> final�� �����Ͽ� ������ �ȵǰ��� -> �̰��� template method��� ��
		startCar();
		drive();
		stop();
		turnOff();
		washCar(); // �Ÿ޼����� ��.. �ƹ� ����� ����.. ���� Ŭ�������� ������ �ϸ� ����� �߰���
		// �̷��� ������ ���ø� �޼��� �����̶�� ��
	}

}
