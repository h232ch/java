package Practice;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("김세환", 15000);
		c1.calcPrice();
		
		Customer c2 = new GoldCustomer("김세호", 15000);
		c2.calcPrice();
		
		Customer c3 = new VIPCustomer("김세후", 15000, 1500);
		c3.calcPrice();
		
		ArrayList<Customer> custList = new ArrayList<Customer>();
		
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		
		for(Customer c: custList) { // 폴리모피즘 + 상속
			c.showInfo();
		}
	}
}
