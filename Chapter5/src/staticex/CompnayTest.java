package staticex;

import java.util.Calendar;

public class CompnayTest {
	
	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company2); //동일한 주소값을 가지고 있음 -> 동일한 인스턴스를 JVM의 가비지컬렉션 전까지 구동
		
		Calendar calendar = Calendar.getInstance(); // 대표적인 싱글톤 패턴 -> 동일한 이스턴스를 지속적을 사용, 변동제어
		System.out.println(calendar.getTime());
	}
}
