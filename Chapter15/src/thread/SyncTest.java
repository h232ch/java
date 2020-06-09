package thread;

class Bank{ // ũ��Ƽ�� ����
	private int money =10000;
	
	public void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+save);
	}
	
	public void minusMoney(int minus) {
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


class Park extends Thread{
	public void run() {
		System.out.println("START SAVE");
		SyncTest.myBank.saveMoney(3000); //���̺� �Ӵ��ϰ� 3�ʵ��� ��
		System.out.println("SAVE MONEY : "+SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("START MINUS");
		SyncTest.myBank.minusMoney(1000); // �׻��� �ھ��������� ������ �ھ��� ����� ���̾ƴ� �ʱ⵷�� ���̳ʽ��� ��
		System.out.println("MINUS MONEY : "+SyncTest.myBank.getMoney());
	}
}

public class SyncTest {
	
	public static Bank myBank = new Bank();
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start(); //
		
	}

}
