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
		System.out.println(custName+"님의 등급은 "+custType+" 등급 이며 보너스 포인트는 "+(int)bonusPoint+"원 이며 제품 할인금액은 "+(int)salesPoint+"원 이고 제품의 최종 가격은 "+(int)prodPrice+"원 입니다.");
	}
	
	
	
}
