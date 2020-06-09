package staticex;

public class Company {
	
	private static Company instance = new Company();
	private Company() {} //내부전용 생성자
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
