package interfaceex;

public class Customer implements Buy, Sell{ //����Ʈ �޼������ ���� ��� ���� �߻� 1. �������̵� �ϰų�, 2. �������̽����� �����ϰų� �ؾ���

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}
	
	@Override
	public void order() {
		System.out.println("Customer Order");
	}
	
	public void sayHello() {
		System.out.println("hi");
	}
	
}
