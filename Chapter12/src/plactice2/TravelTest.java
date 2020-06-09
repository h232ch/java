package plactice2;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer c1 = new TravelCustomer("이순신", 40, 100);
		TravelCustomer c2 = new TravelCustomer("김유신", 20, 100);
		TravelCustomer c3 = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		System.out.println(customerList);
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		// 20살 이상인 사용자를 가지고와서 정렬후 출력

	}

}
