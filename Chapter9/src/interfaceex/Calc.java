package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;  // �����Ͻ� static ������ �پ ���ȭ ��
	
	int add(int num1, int num2); // �����Ͻ� static ������ �پ ���ȭ ��
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	public String stringAdd(String s1, String s2);
	
	// �Լ��� �̸� �Ű������� �����ϴ� ���� �Լ��� �ñ״�ó�� �����Ѵٴ� ��
	// �̷��� �޼��带 ������ ���̶�� ���� �ش� �޼��尡 ��� ������ �������� ���� ���� �˰��ִٴ� ��
	// �̰��� �������̽� ���� ������ , �������̽��� �����Ѵ�!
	
	default void description() { //����Ʈ �޼���
		System.out.println("���� ���⸦ �����մϴ�.");
		//myMethod(); JAVA9 ���� ��� ����
	}
	
	default void test(Calc i) { // �̷��� ����Ʈ �޼���� implements�� Ŭ������ �̿��ϴ� ��ü�� ����Ѵ�.
		
		System.out.println("test");
		i.description();
	}
	
	static int total(int[] arr) { //�޼��带 static���� ���ȭ ���Ѽ� �������̽� ������ ���� ����ϰ� ��
		int total = 0;
		
		for(int i: arr) {
			total +=i;
		}
		return total;
		//mystaticMethod(); //
	}
	
	/* private void myMethod() {  �������̽� ����Ʈ �޼��忡�� ���
		System.out.println("private Method");
	}
	
	private static void mystaticMethod() {   ����ƽ �޼��忡�� ���
		System.out.println("private static method");
	} JAVA VERSION 9 ���� ��밡��*/ 
}
