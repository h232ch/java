package thread;


class MyThread2 implements Runnable{
	public void run() { // 필수로 구현해야 함
		int i;
		
		for(i=0;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
		try {
			Thread.sleep(100); //Thread의 스태틱 메서드
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class TreadTest2 {

	public static void main(String[] args) {
		
		System.out.println("START!");  //main 메서드가 하는일 : start 찍고 th1, th2 띄우고 실행 후 end찍기
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
		System.out.println(t); // 쓰레드 이름, 우선순위, 쓰레가 속해있는 그룹
		
		
		System.out.println("END!");
	}

}
