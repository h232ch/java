package polymorphism;

public class VIPCustomer extends Customer { //�Ӽ��� ����� Ȯ��� ����� �޾� ����Ѵ�.
	
	
	//super(); �⺻���� ���� super����, �Ű������� �ִٸ� �Ʒ�ó�� ��������� �־������

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.5;
		//System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}

	private int agentId;
	
	/*public VIPCustomer() { ���� Ŭ���� �����ڰ� �Ű������� ���� ������� �Ʒ��� ���� ���������� �Ű������� �����Ѵٸ� super�� ����� ��� �ʿ�
	 *  ���� super �ڵ� ����
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}*/
	
	/*public int calcPrice(int price) { // ���� �޼��帱 ����Ἥ �ٸ�������� ���� (������ ����� �������� ���ؼ�)
		// �޼��� �����ε��� ���� �޼������ ����ϰ� �Ű������� �ٸ��� �����Ͽ� �ε��ϴ� ����̴�
		bonusPoint+=price*bonusRatio;
		return price;
	}*/
	
	// ������̼� Override�� ��õǸ� ���� Ŭ������ �޼��� �Ű�������, �̸� ���� ��� �����ϰ� ���� ���븸 ���氡���ϰ�  ��
	// ������̼��� ������ �� ������ �ڵ��� ���ռ��� ���� ���ִ°� ����
	@Override //������̼��� -> �����Ϸ����� ��� �������̵��Ⱦֶ�� �����ϴ� ���� ��Ŭ�� > �ҽ� > �������̵����� ���� ��������
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price* bonusRatio;
		return price - (int)(price*salesRatio); //���� Ŭ������ �ٸ��� ���� -> �������̵��Ѵ�!
		
		// @Override, @FuntionalInterface ����, @Deprecated @suppre...�پ��� ������̼� ������
	}


	public double getSalesRatio() {
		return salesRatio;
	}

	
	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	

}
