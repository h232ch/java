package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> custList = new ArrayList<Customer>();
		
		Customer c1 = new Customer(1, "ÀÌ¼ø½Å", 33, 100);
		custList.add(c1);
		Customer c2 = new Customer(1, "±èÀ¯½Å", 20, 100);
		custList.add(c2);
		Customer c3 = new Customer(1, "È«±æµ¿", 13, 50);
		custList.add(c3);
		
		int[] cCostList = new int[custList.size()];
		String[] cNameList = new String[custList.size()];
		
		
		for(int i=0;i<custList.size();i++) {
			cCostList[i] = custList.get(i).getCustCost();
			cNameList[i] = custList.get(i).getCustName();
		}

		Stream<Customer> stream = custList.stream();
		stream.forEach(s->System.out.print(s.getCustName()+" "));
		
		int sum = Arrays.stream(cCostList).sum();
		System.out.println(sum);
		
		
		
		
		
		
	}

}
