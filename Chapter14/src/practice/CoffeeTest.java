package practice;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		Coffee KenyaLatte = new Lattee(new KenyaAmericano());
		KenyaLatte.brewing(); 
		
		// 데코레이터 패턴
		// 커피 추상클래스 -> (상속)케냐커피, (상속)데코레이터
		// 데코에서 Coffe 생성자 생성, brewing()에서 생성한 인스턴스에서 실행
		// Lattee에서 데코레이터 상속, 생성자 오버라이딩, brewing()오버라이딩
		
		
		Coffee etiCoffee = new EtiopiaAmericano();
		etiCoffee.brewing();
		
		Coffee mCoffee = new Mocha(etiCoffee);
		mCoffee.brewing();
		
		Coffee mCoffee2 = new Mocha(new EtiopiaAmericano());
		mCoffee2.brewing();
	}

}
