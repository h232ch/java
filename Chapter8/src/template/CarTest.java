package template;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car aiCar = new AIcar();
		aiCar.run();
		
		System.out.println("============");
		Car mCar = new ManualCar();
		mCar.run(); // 이렇듯 프레임워크는 이러한 템플릿 메서드를 선언하여 흐름을 제어함

	}

}
