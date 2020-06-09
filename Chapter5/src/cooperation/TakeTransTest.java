package cooperation;

public class TakeTransTest {
	
	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentK = new Student("Kim", 6000);
		
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayRed = new Subway(3);
		
		studentJ.takeBus(bus100);
		studentK.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentK.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
	}

}
