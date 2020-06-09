package lamda;

@FunctionalInterface
interface PrintString{
	void showString(String str);
}

class printString2 implements PrintString{

	@Override
	public void showString(String str) {
		System.out.println("printString2 : "+str);
	}
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdaStr = s->System.out.println(s); //�Լ��� �����ΰ� ������ �ٷ� ���ԵǴ�
		lambdaStr.showString("test");
		
		printString2 lam2 = new printString2(); //���ٴ� ������ printString �������̽��� �����ϰų��ϴ� Ŭ������ �ȸ�����
		lam2.showString("test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("test3");
		
	}
	
	public static void showMyString(PrintString p) { //printString �����δ� mainŬ������ ���� �ڹٽ�ũ��Ʈ������ �̷��κ��� ����
		p.showString("test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + "!!!");
	}

}
