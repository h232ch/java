package innerclass;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { 
		int num = 100; 
		return new Runnable() { //�͸� �̳� Ŭ����, �̸��̾��� �̳� Ŭ������ ź��! Ŭ������ ������ ������ �������� �ʰ� �ٷ� ������
			@Override
			public void run() { 
				//num+=10; ���������� �޼��� ������ ������ �Ҹ��! ������ return�� �����ڷ� �ޱ⿡ �޼ҵ尡 ����� �Ŀ��� ��� ��밡���ϱ� ������
				//�ڵ����� ���������� staticȭ ��Ŵ �׷��� ������ �Ұ����� ������ ������
				System.out.println(num);
				System.out.println(outNum);
				System.out.println(Outer2.sNum);
				 
			}}; //�����Ҷ� Runnable�� ���� �����ؼ� ���� ����
	}
	
	Runnable runner = new Runnable() { //�ڵ����� ���� ��ϸӽ� �̳� Ŭ����!
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {
	
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run(); //�͸� �̳�Ŭ���� �߻�, �������̽� �����ϴ� �̳� Ŭ������ �ٷ� ������ �� ����, �������� ���� �ν��Ͻ������� �����~ �ߴٸ� �̰� �ٷλ������
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}