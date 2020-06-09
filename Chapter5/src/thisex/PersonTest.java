package thisex;

public class PersonTest {
	public static void main(String[] args) {
		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personLee = new Person("test",19);
		personLee.showInfo();
		
		personLee.getSelf();
		System.out.println(personLee);
		
		Person p = personLee.getSelf(); // PersonLee를 복사한 p 객체를 생성 -> 동일한 객체를 가르킴
		System.out.println(p); //getSelf의 리턴값은 this이므로 동일한참조값을 바라보는 것임
	}
}
