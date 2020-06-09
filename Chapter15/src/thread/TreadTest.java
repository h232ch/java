package thread;


class MyThread extends Thread{
	public void run() { // �ʼ��� �����ؾ� ��
		int i;
		
		for(i=0;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
		try {
			sleep(100); //Thread�� ����ƽ �޼���
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class TreadTest {

	public static void main(String[] args) {
		
		System.out.println("START!");  //main �޼��尡 �ϴ��� : start ��� th1, th2 ���� ���� �� end���
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start(); th2.start();
		System.out.println("END!");
	}

}
