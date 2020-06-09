package abstractex;

public class Desktop extends Computer{

	@Override //Abstract 메서드를 상속받아야 함
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Display");
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Type");
		
	}
	

}
