package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		System.out.println("");
		
		Customer c1 = new Customer();
		c1.buy();
		c1.sell();
		c1.order();
		c1.sayHello();
		
		Buy b1 = c1; // Buy�� b1�� ������������ c1�� ������������ �־��� �ᱹ �ϳ��� �ٶ󺸰� �ϸ鼭 ���ٱ��Ѹ� �����ϴ� ����
		
		b1.buy();
		b1.order();
		//b1.sayHello(); ���� Buy������ sayHello�� ����
		System.out.println(b1);
		System.out.println(c1);
		
		Sell s1 = c1;
		//s1.buy ������������
		s1.sell();
		s1.order();
	}

}
