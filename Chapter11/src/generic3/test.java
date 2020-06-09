package generic3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// testab는 testab2를 상속받았다.
		
		testab a = new testab();
		
		testab2 ab = new testab2();
		
		testab2 a2 = new testab();
		
		a2.helloWorld();
		// a2.hellotestab(); 사용불가
		
		a.hellotestab();
		a.helloWorld();
		
		ab.helloWorld();
		
		

	}

}
