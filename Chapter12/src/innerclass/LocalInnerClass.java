package innerclass;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // �޽��� ���� Ŭ���� ����
		int num = 100; //��������, �޼��尡 ȣ��ǰ� ���������� ��ȿ�Ѱ͵� 
		class MyRunnable implements Runnable{ // ���� ���� Ŭ������� ��
			@Override
			public void run() { //���Ҷ� ������ �½�ũ
				//num +=10; //MyRunnable �������� ��ȯ�ϸ鼭, �ش簪�� ��� ȣ��ɼ��ֱ⶧���� �ڵ����� staticȭ ���ѹ��� �׷��� ���� �������� ����
				//������ζ�� num���� �޼��� ������ ��� ������Ե�
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				System.out.println(num);
			}
		}
		return new MyRunnable(); // �������ϰ� ���� MyRunnable�� �������� ��밡���ϰ� �� �׷��� ���������� ���ȭ���Ǿ���� �׷���, ������ �Ҽ�������
		// ������ ��������
	}
}

public class LocalInnerClass {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
