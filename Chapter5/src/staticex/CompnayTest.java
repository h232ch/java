package staticex;

import java.util.Calendar;

public class CompnayTest {
	
	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company2); //������ �ּҰ��� ������ ���� -> ������ �ν��Ͻ��� JVM�� �������÷��� ������ ����
		
		Calendar calendar = Calendar.getInstance(); // ��ǥ���� �̱��� ���� -> ������ �̽��Ͻ��� �������� ���, ��������
		System.out.println(calendar.getTime());
	}
}
