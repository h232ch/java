package interfaceex;

public class CalcTest {
	
	public static void main(String[] args) {
		//CompleteCalc calc = new CompleteCalc();
		//Calculator calc = new CompleteCalc();
		Calc calc = new CompleteCalc(); // Clac �������̽� Ÿ���� calc��CompleteCalc�� �ν��Ͻ�  ���������� ����
		int n1=10; int n2=2;
		
		calc.description(); //����Ʈ �޼��带 �̿��ϴ� ��
		calc.test(calc);
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		//calc.showInfo(); �̰��� ����ϰ��� �Ѵٸ� ComplateCalc Ÿ���� ����ؾ� ��	
		
		calc.description(); //����Ʈ �޼��� ����, ������ interface�� �����ϸ�, Calc �ν��Ͻ� ������ ��밡��
		// ������ ������ CompliteCalc �޼��忡�� �ش� �޼��带 �����ε�(����)�ؼ� ������ CompliteCalc�� �޼��尡 ����
		
		int[] arr= {1,2,3,4,5};
		int sum=Calc.total(arr); // �������̽� Ÿ������ �����ٰ� ��
		System.out.println(sum);
	}

}
