package cooperation2;

public class Taxi {
	
	int taxiNumber; int money; int takeCount;
	
	public Taxi(int taxiNumber, int money) {
		this.taxiNumber = taxiNumber;
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println("Taxi's money is "+money);
	}
	
	
	

}
