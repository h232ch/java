package polymorphism;

public class GoldCustomer extends Customer {

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		bonusRatio = 0.02;
		salesRatio = 0.2;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price* bonusRatio;
		return price - (int)(price*salesRatio); 
	}
	
	
	
}
