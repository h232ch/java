package Practice;

public class VIPCustomer extends Customer{
	
	int agentNum;

	public VIPCustomer(String custName, double prodPrice, int agentNum) {
		super(custName, prodPrice);
		// TODO Auto-generated constructor stub
		this.agentNum=agentNum;
		custType="VIP";
		salesRatio = 15.0;
		bonusRatio = 5.0;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("또한 소중한 "+custName+" 고객님의 전용 상담사 번호는 "+agentNum+" 입니다.");
	}
}
