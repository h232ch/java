package thisex;

public class PersonTest {
	public static void main(String[] args) {
		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personLee = new Person("test",19);
		personLee.showInfo();
		
		personLee.getSelf();
		System.out.println(personLee);
		
		Person p = personLee.getSelf(); // PersonLee�� ������ p ��ü�� ���� -> ������ ��ü�� ����Ŵ
		System.out.println(p); //getSelf�� ���ϰ��� this�̹Ƿ� �������������� �ٶ󺸴� ����
	}
}
