package Practice;

public class GoldCustomer extends Customer{

	public GoldCustomer(String custName, double prodPrice) {
		super(custName, prodPrice);
		// TODO Auto-generated constructor stub
		custType="GOLD";
		salesRatio = 10.0;
		bonusRatio = 2.0;
	}

}
