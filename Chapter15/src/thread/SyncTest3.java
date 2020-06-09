package thread;

class Bank3{ // ũ��Ƽ�� ����
	private int money =10000;
	
	public void saveMoney(int save) {
		synchronized (this) { //��ũ�γ����� ��Ϲ�� ��ũ3 ��
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
		SyncTest3.myBank.saveMoney(3000); //���̺� �Ӵ��ϰ� 3�ʵ��� ��
		System.out.println("SAVE MONEY : "+SyncTest3.myBank.getMoney());
	}
}

class ParkWife3 extends Thread{
	public void run() {
		synchronized (SyncTest3.myBank) { // Ŭ�������� ��ũ�γ����� ��� �ɼ����� �Ʒ��� ������ ��
			System.out.println("START MINUS");
			SyncTest3.myBank.minusMoney(1000); // �׻��� �ھ��������� ������ �ھ��� ����� ���̾ƴ� �ʱ⵷�� ���̳ʽ��� ��
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
