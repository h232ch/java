package thread;

class Bank3{ // 크리티컬 섹션
	private int money =10000;
	
	public void saveMoney(int save) {
		synchronized (this) { //신크로나이즈 블록방식 밴크3 블럭
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m+save);
		}
	}
	
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m-minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}


class Park3 extends Thread{
	public void run() {
		System.out.println("START SAVE");
		SyncTest3.myBank.saveMoney(3000); //세이브 머니하고 3초동안 쉼
		System.out.println("SAVE MONEY : "+SyncTest3.myBank.getMoney());
	}
}

class ParkWife3 extends Thread{
	public void run() {
		synchronized (SyncTest3.myBank) { // 클래스에서 신크로나이즈 블록 걸수있음 아래의 내용을 블럭
			System.out.println("START MINUS");
			SyncTest3.myBank.minusMoney(1000); // 그사이 박씨와이프가 시작함 박씨는 저축된 돈이아닌 초기돈에 마이너스를 함
			System.out.println("MINUS MONEY : "+SyncTest3.myBank.getMoney());
		}
	}
}

public class SyncTest3 {
	
	public static Bank3 myBank = new Bank3();
	public static void main(String[] args) throws InterruptedException {
		
		Park3 p = new Park3();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife3 pw = new ParkWife3();
		pw.start(); //
		
	}

}
