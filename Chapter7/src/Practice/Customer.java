package Practice;

public class Customer {
	
	String custName;
	String custType;
	double prodPrice;
	double salesRatio;
	double salesPoint;
	double bonusRatio;
	double bonusPoint=0;
	
	public Customer(String custName, double prodPrice) {
		this.custName=custName;
		this.prodPrice=prodPrice;
		custType="SILVER";
		salesRatio = 5.0;
		bonusRatio = 2.0;
	}
	
	public void calcPrice() {
		bonusPoint =(bonusRatio*prodPrice)/100;
		salesPoint = (salesRatio*prodPrice)/100;
		prodPrice = prodPrice-salesPoint;
	}
	
	public void showInfo() {
		System.out.println(custName+"���� ����� "+custType+" ��� �̸� ���ʽ� ����Ʈ�� "+(int)bonusPoint+"�� �̸� ��ǰ ���αݾ��� "+(int)salesPoint+"�� �̰� ��ǰ�� ���� ������ "+(int)prodPrice+"�� �Դϴ�.");
	}
	
	
	
}
