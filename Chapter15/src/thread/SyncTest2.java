package thread;

class Bank1{ // 크리티컬 섹션
	private int money =10000;
	
	public synchronized void saveMoney(int save) { //여기에 락을 걸어주면 Bank에 락이걸림, 해당 메서드 수행시 Bank의 전체가 락걸림
		
		// 락을 건 후 재데로된 값을 확인할 수 있음 
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+save);
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


class Park1 extends Thread{
	public void run() {
		System.out.println("START SAVE");
		SyncTest2.myBank.saveMoney(3000); //세이브 머니하고 3초동안 쉼
		System.out.println("SAVE MONEY : "+SyncTest2.myBank.getMoney());
	}
}

class ParkWife1 extends Thread{
	public void run() {
		System.out.println("START MINUS");
		SyncTest2.myBank.minusMoney(1000); // 그사이 박씨와이프가 시작함 박씨는 저축된 돈이아닌 초기돈에 마이너스를 함
		System.out.println("MINUS MONEY : "+SyncTest2.myBank.getMoney());
	}
}

public class SyncTest2 {
	
	public static Bank1 myBank = new Bank1();
	public static void main(String[] args) throws InterruptedException {
		
		Park1 p = new Park1();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife1 pw = new ParkWife1();
		pw.start(); //
		
	}

}
