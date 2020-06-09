package thread;


class MyThread extends Thread{
	public void run() { // 필수로 구현해야 함
		int i;
		
		for(i=0;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
		try {
			sleep(100); //Thread의 스태틱 메서드
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class TreadTest {

	public static void main(String[] args) {
		
		System.out.println("START!");  //main 메서드가 하는일 : start 찍고 th1, th2 띄우고 실행 후 end찍기
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start(); th2.start();
		System.out.println("END!");
	}

}
