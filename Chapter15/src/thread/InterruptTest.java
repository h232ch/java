package thread;

public class InterruptTest extends Thread{
	
	public void run() {
		int i ;
		for(i=0;i<100;i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Awake!");
		}
	}

	public static void main(String[] args) {
		
		InterruptTest test = new InterruptTest();
		test.start();
		test.interrupt(); // 99 鳖瘤 嘛部 劳剂记 惯积窃!
		
		
	}

}
