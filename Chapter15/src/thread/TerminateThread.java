package thread;

import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100); //1초
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(getName()+" END");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		
		threadA.start();
		threadB.start();
		
		int in;
		while(true) {
			in = System.in.read(); // 식별자를 치고 ..
			if(in=='A') {
				threadA.setFlag(true);
			}else if(in =='B') {
				threadB.setFlag(true);
			}else if(in =='M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				break;
			}else {
				//System.out.println("Try Again");
			}
		}
		System.out.println("END");
	}

}
