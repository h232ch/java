package cooperation2;

public class Person {
	
	String psersonName; int money; int time;
	
	public Person(String personName, int money) {
		this.money = money;
		this.psersonName = personName;
	}
	
	public void timeCheck(int time) {
		this.time = time;
		if(time>8) {
			System.out.println("�����Դϴ�. �ýø� �̿��ϼ���.");
		}else {
			System.out.println("������ �ƴմϴ�. ������ �̿��ϼ���.");
		}
	}
	
	public void take(Taxi taxi) {
		
		if(money<1200) {
			System.out.println("���� ���ڶ��ϴ�...("+(1200-money)+")");
			
		}else{
			taxi.money += 1200;
			money -= 1200;
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		}
		
	}
	
	public void showInfo() {
		System.out.println("Person's money is "+money);
	}

}
