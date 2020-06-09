package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		//age = 100; 오류 발생, this로 변수값 지정시 제일 먼저 수행되어야 함
		this("이름없음",1); //아래의 생성자를 사용
	}
	public Person(String name, int age) {
		this.name = name; this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name+","+age);
	}
	
	public Person getSelf() {
		return this; //자기 자신을  반환
	}

}
