package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		//age = 100; ���� �߻�, this�� ������ ������ ���� ���� ����Ǿ�� ��
		this("�̸�����",1); //�Ʒ��� �����ڸ� ���
	}
	public Person(String name, int age) {
		this.name = name; this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name+","+age);
	}
	
	public Person getSelf() {
		return this; //�ڱ� �ڽ���  ��ȯ
	}

}
