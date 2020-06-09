package polymorphism;

public class VIPCustomer extends Customer { //속성과 기능의 확장시 상속을 받아 사용한다.
	
	
	//super(); 기본으로 들어가는 super문구, 매개변수가 있다면 아래처럼 명시적으로 넣어줘야함

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.5;
		//System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	private int agentId;
	
	/*public VIPCustomer() { 상위 클래스 생성자가 매개변수를 받지 않을경우 아래와 같이 가능하지만 매개변수가 존재한다면 super의 명시적 사용 필요
	 *  위의 super 코드 참고
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}*/
	
	/*public int calcPrice(int price) { // 동일 메서드릴 덮어써서 다른기능으로 생성 (상위의 기능을 하위에서 재해석)
		// 메서드 오버로딩은 동일 메서드명을 사용하고 매개변수만 다르게 구성하여 로딩하는 경우이다
		bonusPoint+=price*bonusRatio;
		return price;
	}*/
	
	// 어노테이션 Override가 명시되면 상위 클래스의 메서드 매개변수값, 이름 등을 모두 같게하고 내부 내용만 변경가능하게  함
	// 어노테이션은 삭제할 수 있으나 코드의 정합성을 위해 써주는게 좋음
	@Override //어노테이션임 -> 컴파일러한테 얘는 오버라이딩된애라고 전달하는 역할 우클릭 > 소스 > 오버라이딩으로 쉽게 생성가능
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price* bonusRatio;
		return price - (int)(price*salesRatio); //상위 클래스와 다르게 구성 -> 오버라이딩한다!
		
		// @Override, @FuntionalInterface 람다, @Deprecated @suppre...다양한 어노테이션 존재함
	}


	public double getSalesRatio() {
		return salesRatio;
	}

	
	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	

}
