package lamda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x,y)->(x>=y)?x:y; //x,y�ΰ��� �Ѿ�´�. ���� ��ū ���ڸ� ��ȯ�� ���
		System.out.println(max.getMaxNumber(10, 20)); //���ٽ��� ���� �����ؾ���

	}

}
