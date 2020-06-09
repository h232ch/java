package singletone;

public class SingleTonTest {

	public static void main(String[] args) {
		
		Normal n1 = new Normal();
		Normal n2 = new Normal();
		
		//SingleTone s1 = new SingleTone(); 오류발생 SingleTone은 Private으로 설정되어있음
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance(); // 스태틱으로 선언하여 한번 생성후 계속 동일한 값을 호출함
		
		System.out.println(s1.equals(s2)); // 물리적으로 동일한 값이라는 의미이다.
		System.out.println(n1.equals(n2)); // 물리적으로 동일하지 않은 값이라는 의미이다.

	}

}
