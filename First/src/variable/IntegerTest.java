package variable;

public class IntegerTest {
	
	public static void main(String args[]) {
		
		byte bs = -128;
		byte bs2 = 127;
		System.out.println(bs);
		System.out.println(bs2);
		
		//byte bs = 128; ���� �߻�
		//byte bs = -129; ���� �߻�
		
		//int lVal = 12345678900; �̷��� �ڹٿ����� ������ ����(�޸𸮹���)�� ������ -> Literal
		long lVal = 12345678900L; // �ڹٴ� �⺻������ ���ڴ� int������ ��� Long ������ �ڿ� L���� �߿�
		
		// byte = 1 (-2^7 ~2^7-a), Short = 2(-2^15~2^15-1), int=4(-2^31~2^31-1)...
		
	}

}
