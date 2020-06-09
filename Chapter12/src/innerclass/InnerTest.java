package innerclass;

class OutClass{
	private int num=10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{ // �ν��Ͻ� ���� Ŭ���� OutClass$inClass.java
		int iNum = 100;
		// static int sInNum = 200; ���� �߻�, static Ŭ������� static ���� ��밡��, ������ �Ϲ� �޼��忡 Static ������ ����Ҽ� ����
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum =100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() { //static Ŭ�������� static �޼��� , ���� ��� ������ִ�.
			//System.out.println(inNum); ����ƽ �޼��忡���� �Ϲ� ������ ����� �� ����, ����ƽ ������ ������ ������� Ŭ���� �̸����� ����Ҽ� �־����
			
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner(); // inClas ��ü�� Private�̶� ��� ��� �Ұ��ϰ� �޼��带 �̿��ؾ���
		OutClass.InClass myInClass = outClass.new InClass(); // inClass�� �����ϱ� ���� outClass ���������� �̿��ؼ� new �Ҽ� ����
		// ���� �ν��Ͻ� inclass�� ��� private���� �����. �׸��� �뵵 ��ü�� Ŭ���� ���ο����� ����ϴ°��̶� ���Ͱ��� �ڵ��� ���� ����
		
		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); // ����ƽ �޼��尡 �ƴϱ⶧���� inNum�� ȣ���� �� �̵�~
		OutClass.InStaticClass.sTest(); // ����ƽ �޼���� �ν��Ͻ� ���� �ٷ� ���� �����ϴ�! �߿�
		sInClass.sTest(); // ����ƽ�̹Ƿ� Ŭ���������� �����϶�� ���Ǹ� ��
	}

}