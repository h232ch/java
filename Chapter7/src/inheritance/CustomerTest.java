package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Customer customerLee  = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());*/
		
		//Customer customerTest = new VIPCustomer(1002,"TEST"); // VIPCustomer�� calcPrice�� �޼��尡 ȣ��� -> �̰��� ���� �޼��尡 ȣ��ȴٰ� ��
		//customerTest.bonusPoint = 1000;
		
		// Customer�� ��ӹ޴� VIPCustomer�� �̹� Customer�� �����Ǿ�����
		//����Ŭ������ ����Ŭ������ �ν��Ͻ��� �����Ҷ� -> ������ ����ȯ ��=s���� ��� �ڵ� ����ȯ�� �����̸� �̸� Upcasting�̶�� ��
		
		//Customer (����)Ÿ�� + VIPCustomer (����)�ν��Ͻ� -> Customer�� ������ ��밡�� ����: �޸𸮴� VIPCustomer���� �����������, Ÿ���� Customer�̱� ������
		//Customer�� ������ ���̰� ��
		
		//customerKim.setSalesRatio(1);
		//customerLee.setSalesRatio(1); ���� �߻�, VIPCustomer�� ������ ����� �� ���� -> �޸𸮴� VIPCustomer�� �������� �Ҵ�ǳ� �������°� VIPCustomer�� �ƴ�
		//���� > ������ ���丸 ���������� ���� �߿��߿�
		
		//Primate aHumaman = new Human();
		//Mammal mHuman = new Human();
		
		//VIPCustomer ������ ���� Ŭ������ ���� �����ϰ� ���� Ŭ������ ������
		//���� Ŭ���������� ������ ���� Ŭ���� �����ڸ� ȣ���ؾ� ��
		//���� Ŭ�������� ���� Ŭ���� ȣ���� ���ٸ� super();��� �ڵ带 �ڵ����� ������
		//this=���ڽ��������� / super=����Ŭ�����Ǹ޸���ġ��������
		//super = Customer() -> �⺻�����ڰ� ������
		//���� ���� Ŭ������ ������
		
		//�ſ�ſ��߿�~!!
		//Customer�� ���� customerLee�� VIPCustomer������ �ν��Ͻ��� �����ȴ�.
		//�̶� calcPrice�� ��� VIPCustomer�� ��ӹް� customerLee�� �� �Լ��� ���� VIPCustomer�� �������̵��� �Լ��� ���ȴ�.
		
		Customer customerKim  = new VIPCustomer(1000,"�輼ȯ");
		customerKim.bonusPoint = 1000;
		
		Customer customerHy  = new Customer(1001,"������");
		customerKim.bonusPoint = 1000;
		
		int priceLee = customerKim.calcPrice(10000);
		int priceHy = customerHy.calcPrice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� "+priceLee +"�� �Դϴ�.");
		System.out.println(customerHy.showCustomerInfo() + "���ұݾ��� "+priceHy +"�� �Դϴ�.");
		
		Customer customerTest = new VIPCustomer(1002,"TEST"); // VIPCustomer�� calcPrice�� �޼��尡 ȣ��� -> �̰��� ���� �޼��尡 ȣ��ȴٰ� ��
		customerTest.bonusPoint = 1000;
		int priceTest = customerTest.calcPrice(10000);
		System.out.println(customerTest.showCustomerInfo() + "���ұݾ��� "+priceTest +"�� �Դϴ�.");
		//������ Customer���� ������ Customer���� �����͸� ����
	}

}
