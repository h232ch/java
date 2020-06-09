package practice;

public abstract class Decorator extends Coffee{ //상속전용 클래스
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
	

}
