package Chapter3;

public class OperatorEx6 {
	
	public static void main(String[] args) {
		
		
		int num1 = 0B0001010; //10;
		int num2 = 0B0000101; //5;
		
		System.out.println(num1 & num2); // AND ���
		System.out.println(num1 | num2); // Or ���
		System.out.println(num1 ^ num2); // Exclusive Or
		
		System.out.println(num2<<1); //x2�Ѱ�
		System.out.println(num2<<3); //x4�Ѱ�
		System.out.println(num1>>1); // 1�� ������
		System.out.println(num1>>2); // 2�� ������
		
	}

}