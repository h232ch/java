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
		System.out.println("���� ������ "+custName+" ������ ���� ���� ��ȣ�� "+agentNum+" �Դϴ�.");
	}
}
