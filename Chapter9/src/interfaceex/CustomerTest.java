package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		System.out.println("");
		
		Customer c1 = new Customer();
		c1.buy();
		c1.sell();
		c1.order();
		c1.sayHello();
		
		Buy b1 = c1; // Buy형 b1의 참조변수값에 c1의 참조변수값을 넣어줌 결국 하나를 바라보게 하면서 접근권한만 통제하는 것임
		
		b1.buy();
		b1.order();
		//b1.sayHello(); 없음 Buy형에는 sayHello가 없음
		System.out.println(b1);
		System.out.println(c1);
		
		Sell s1 = c1;
		//s1.buy 존재하지않음
		s1.sell();
		s1.order();
	}

}
