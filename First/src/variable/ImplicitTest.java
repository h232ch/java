package variable;

public class ImplicitTest {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum; // ������ -> ū�� ������ ����ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		
		System.out.println(dNum); //iNum�� Float�� ����ǰ� fNum�� ���Ѱ��� Double�� �����
		

	}

}
