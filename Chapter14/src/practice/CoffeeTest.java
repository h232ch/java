package practice;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		Coffee KenyaLatte = new Lattee(new KenyaAmericano());
		KenyaLatte.brewing(); 
		
		// ���ڷ����� ����
		// Ŀ�� �߻�Ŭ���� -> (���)�ɳ�Ŀ��, (���)���ڷ�����
		// ���ڿ��� Coffe ������ ����, brewing()���� ������ �ν��Ͻ����� ����
		// Lattee���� ���ڷ����� ���, ������ �������̵�, brewing()�������̵�
		
		
		Coffee etiCoffee = new EtiopiaAmericano();
		etiCoffee.brewing();
		
		Coffee mCoffee = new Mocha(etiCoffee);
		mCoffee.brewing();
		
		Coffee mCoffee2 = new Mocha(new EtiopiaAmericano());
		mCoffee2.brewing();
	}

}
