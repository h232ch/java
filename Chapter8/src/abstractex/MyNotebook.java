package abstractex;

public class MyNotebook extends Notebook{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Notebook Display");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("지문인식 진행");
		super.turnOn();
	}
	
	
	

}
