package practice;

public class Customer {
	
	
	
	private int custNum;
	private String custName;
	private int custAge;
	private int custCost;
	
	public Customer(int custNum, String custName, int custAge, int custCost) {
		this.custNum = custNum;
		this.custName = custName;
		this.custAge = custAge;
		this.custCost= custCost;
	}

	public int getCustNum() {
		return custNum;
	}

	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public int getCustCost() {
		return custCost;
	}

	public void setCustCost(int custCost) {
		this.custCost = custCost;
	}
	
	
	
	
	

}
