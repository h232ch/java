package classpart;

public class Java {
	
	int age; String name; boolean marriage; int child;
	
	Java() {} // �⺻ ������ -> �����ڰ� ���ٸ� �ڵ����� ��������� ��
	
	// Ȥ�� �����ε� �������� ���α׷��Ӱ� �⺻ �����ڸ� ���� ����� ���� ����
	
	public Java(int age, String name, boolean marriage, int child) { // ���α׷��Ӱ� ������� ������
		this.age = age;
		this.name = name;
		this.marriage = marriage;
		this.child = child;
	}
	
	public void getInfo() {
		System.out.println("���� : "+age);
		System.out.println("�̸� : "+name);
		System.out.println("��ȥ���� : "+marriage);
		System.out.println("�ڳ�� : "+child);
	}

}
