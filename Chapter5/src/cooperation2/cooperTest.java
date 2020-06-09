package cooperation2;

public class cooperTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Kimsehwan",1500);
		Taxi t1 = new Taxi(1500, 1500);
		
		p1.timeCheck(9);
		
		p1.take(t1);
		
		p1.showInfo();
		t1.showInfo();
		
	}

}
