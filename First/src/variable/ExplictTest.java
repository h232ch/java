package variable;

public class ExplictTest {
	
	public static void main(String[] args) {
		
		int i = 1000;
		//byte bNum =i; ū���� ���������� ���� ���� �߻� ����� ��ȯ �ʿ�
		
		byte bNum = (byte)i; // ����� ����ȯ, �̶� ���ڰ� ���ǵɼ����� _ ����Ʈ�� -2^7 ~ 2^7-1 ���� ǥ��
		// ���ڰ� �߸��鼭 ������ �߻���
		
		System.out.println(bNum);
		
		double dNum1 =1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum; // Int������ ��ȯ�� ����
		int iNum2 = (int)(dNum1 + fNum); // ������ Int������ ��ȯ
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
	}

}
