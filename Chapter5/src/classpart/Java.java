package classpart;

public class Java {
	
	int age; String name; boolean marriage; int child;
	
	Java() {} // 기본 생성자 -> 생성자가 없다면 자동으로 만들어지는 것
	
	// 혹은 오버로딩 개념으로 프로그래머가 기본 생성자를 만들어서 사용할 수도 있음
	
	public Java(int age, String name, boolean marriage, int child) { // 프로그래머가 만들어준 생성자
		this.age = age;
		this.name = name;
		this.marriage = marriage;
		this.child = child;
	}
	
	public void getInfo() {
		System.out.println("나이 : "+age);
		System.out.println("이름 : "+name);
		System.out.println("결혼여부 : "+marriage);
		System.out.println("자녀수 : "+child);
	}

}
