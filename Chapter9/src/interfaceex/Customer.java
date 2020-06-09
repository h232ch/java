package interfaceex;

public class Customer implements Buy, Sell{ //디폴트 메서드명이 같을 경우 오류 발생 1. 오버라이딩 하거나, 2. 인터페이스명을 변경하거나 해야함

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
