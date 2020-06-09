package thread;


class MyThread2 implements Runnable{
	public void run() { // �ʼ��� �����ؾ� ��
		int i;
		
		for(i=0;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
		try {
			Thread.sleep(100); //Thread�� ����ƽ �޼���
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class TreadTest2 {

	public static void main(String[] args) {
		
		System.out.println("START!");  //main �޼��尡 �ϴ��� : start ��� th1, th2 ���� ���� �� end���
		/*MyThread2 th1 = new MyThread2();
		MyThread2 th2 = new MyThread2();
		
		th1.start(); th2.start();*/
		
		MyThread2 runner1 = new MyThread2();
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MyThread2 runner2 = new MyThread2();
		Thread th2 = new Thread(runner2);
		th2.start();
		
		Thread t = Thread.currentThread();
		System.out.println(t); // ������ �̸�, �켱����, ������ �����ִ� �׷�
		
		
		System.out.println("END!");
	}

}
