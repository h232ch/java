package singletone;

public class SingleTonTest {

	public static void main(String[] args) {
		
		Normal n1 = new Normal();
		Normal n2 = new Normal();
		
		//SingleTone s1 = new SingleTone(); �����߻� SingleTone�� Private���� �����Ǿ�����
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance(); // ����ƽ���� �����Ͽ� �ѹ� ������ ��� ������ ���� ȣ����
		
		System.out.println(s1.equals(s2)); // ���������� ������ ���̶�� �ǹ��̴�.
		System.out.println(n1.equals(n2)); // ���������� �������� ���� ���̶�� �ǹ��̴�.

	}

}
