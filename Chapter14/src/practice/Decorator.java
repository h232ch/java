package practice;

public abstract class Decorator extends Coffee{ //������� Ŭ����
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
	

}
