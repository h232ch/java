package template;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car aiCar = new AIcar();
		aiCar.run();
		
		System.out.println("============");
		Car mCar = new ManualCar();
		mCar.run(); // �̷��� �����ӿ�ũ�� �̷��� ���ø� �޼��带 �����Ͽ� �帧�� ������

	}

}
