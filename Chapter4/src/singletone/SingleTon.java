package singletone;

public class SingleTon {
	
	private static SingleTon singletone = new SingleTon();
	private SingleTon() {
		System.out.println("SingleTone Instance Created....");
	}
	
	public static SingleTon getInstance() { // Ŭ���� ��ü�� ����ƽ�̱� ������ �ش� �޼��嵵 �ݵ�� ����ƽ�� �Ǿ����
		// ����ƽ�̵��� ������ ��������!
		return singletone;
	}

}
