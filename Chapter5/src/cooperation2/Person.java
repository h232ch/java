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
			System.out.println("지각입니다. 택시를 이용하세요.");
		}else {
			System.out.println("지각이 아닙니다. 버스를 이용하세요.");
		}
	}
	
	public void take(Taxi taxi) {
		
		if(money<1200) {
			System.out.println("돈이 모자랍니다...("+(1200-money)+")");
			
		}else{
			taxi.money += 1200;
			money -= 1200;
			System.out.println("결재가 완료되었습니다.");
		}
		
	}
	
	public void showInfo() {
		System.out.println("Person's money is "+money);
	}

}
