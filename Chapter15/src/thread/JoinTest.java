package thread;

public class JoinTest extends Thread{
	
	int start; int end; int total;
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for (i=start; i<end; i++) {
			total+=i;
		}
	}

	public static void main(String[] args) {
		
		JoinTest jt1 = new JoinTest(1,50);
		JoinTest jt2 = new JoinTest(51,100);
		
		jt1.start();
		jt2.start();
		
		try { // 조인하지않으면 레이스컨디션 발생하여 값이 정확히 계싼안됨
			jt1.join();
			jt2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		int total = jt1.total + jt2.total;
		System.out.println("Jt1. total : "+jt1.total);
		System.out.println("Jt2. total : "+jt2.total);
		
		System.out.println(total);
		
	}

}
