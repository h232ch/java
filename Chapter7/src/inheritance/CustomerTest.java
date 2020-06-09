package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Customer customerLee  = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());*/
		
		//Customer customerTest = new VIPCustomer(1002,"TEST"); // VIPCustomer의 calcPrice의 메서드가 호출됨 -> 이것을 가상 메서드가 호출된다고 함
		//customerTest.bonusPoint = 1000;
		
		// Customer를 상속받는 VIPCustomer는 이미 Customer가 내포되어있음
		//상위클래스로 하위클래스의 인스턴스를 생성할때 -> 묵시적 형변환 상=s하의 경우 자동 형변환의 성질이며 이를 Upcasting이라고 함
		
		//Customer (상위)타입 + VIPCustomer (하위)인스턴스 -> Customer의 변수만 사용가능 이유: 메모리는 VIPCustomer까지 만들어졌지만, 타입은 Customer이기 때문에
		//Customer의 변수만 보이게 됨
		
		//customerKim.setSalesRatio(1);
		//customerLee.setSalesRatio(1); 오류 발생, VIPCustomer의 변수를 사용할 수 없음 -> 메모리는 VIPCustomer의 변수까지 할당되나 변수형태가 VIPCustomer가 아님
		//상위 > 하위의 개념만 묵시적으로 가능 중요중요
		
		//Primate aHumaman = new Human();
		//Mammal mHuman = new Human();
		
		//VIPCustomer 생성시 상위 클래스를 먼저 생성하고 하위 클래스가 생성됨
		//하위 클래스에서는 무조건 상위 클래스 생성자를 호출해야 함
		//하위 클래스에서 상위 클래스 호출이 없다면 super();라는 코드를 자동으로 삽입함
		//this=나자신의참조값 / super=상위클래스의메모리위치의참조값
		//super = Customer() -> 기본생성자가 생성됨
		//이후 하위 클래스가 생성됨
		
		//매우매우중요~!!
		//Customer형 변수 customerLee은 VIPCustomer형으로 인스턴스가 생성된다.
		//이때 calcPrice의 경우 VIPCustomer가 상속받고 customerLee가 이 함수를 사용시 VIPCustomer가 오버라이딩한 함수가 사용된다.
		
		Customer customerKim  = new VIPCustomer(1000,"김세환");
		customerKim.bonusPoint = 1000;
		
		Customer customerHy  = new Customer(1001,"김혜수");
		customerKim.bonusPoint = 1000;
		
		int priceLee = customerKim.calcPrice(10000);
		int priceHy = customerHy.calcPrice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 "+priceLee +"원 입니다.");
		System.out.println(customerHy.showCustomerInfo() + "지불금액은 "+priceHy +"원 입니다.");
		
		Customer customerTest = new VIPCustomer(1002,"TEST"); // VIPCustomer의 calcPrice의 메서드가 호출됨 -> 이것을 가상 메서드가 호출된다고 함
		customerTest.bonusPoint = 1000;
		int priceTest = customerTest.calcPrice(10000);
		System.out.println(customerTest.showCustomerInfo() + "지불금액은 "+priceTest +"원 입니다.");
		//하지만 Customer형의 변수라 Customer형의 데이터만 보임
	}

}
