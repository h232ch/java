package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2==0) {
			return ERROR;
		}else {
			return num1 / num2;
		}
		
	}

	@Override
	public String stringAdd(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void showInfo() {
		System.out.println("��� �����߽��ϴ�.");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("�������� description �Դϴ�.");
	}
	
	

}
