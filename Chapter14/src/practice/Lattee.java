package practice;

public class Lattee extends Decorator {

	public Lattee(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk..");
	}

}
