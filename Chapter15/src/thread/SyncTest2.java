package thread;

class Bank1{ // ũ��Ƽ�� ����
	private int money =10000;
	
	public synchronized void saveMoney(int save) { //���⿡ ���� �ɾ��ָ� Bank�� ���̰ɸ�, �ش� �޼��� ����� Bank�� ��ü�� ���ɸ�
		
		// ���� �� �� �絥�ε� ���� Ȯ���� �� ���� 
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
		SyncTest2.myBank.saveMoney(3000); //���̺� �Ӵ��ϰ� 3�ʵ��� ��
		System.out.println("SAVE MONEY : "+SyncTest2.myBank.getMoney());
	}
}

class ParkWife1 extends Thread{
	public void run() {
		System.out.println("START MINUS");
		SyncTest2.myBank.minusMoney(1000); // �׻��� �ھ��������� ������ �ھ��� ����� ���̾ƴ� �ʱ⵷�� ���̳ʽ��� ��
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
