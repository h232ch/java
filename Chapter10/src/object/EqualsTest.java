package object;


class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { // 매개변수 Student 입력시 Upcasting 발생
		if(obj instanceof Student) {
			Student std = (Student)obj; // Student std에 obj 인스턴스를 강제 Down casting
			return (this.studentNum == std.studentNum); // StudentNum(자신)과 stdNum(상대방)을 비교
		}else {
			return false;
		}
	}


	@Override
	public int hashCode() {
		
		return studentNum; // 해시코드를 studentNum으로 변경
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 메모리를 비교 (물리적 비교)
		System.out.println(str1.equals(str2)); // 인스턴스 멤버변수의 값을 비교 (논리적 비교) -> 스트링 클래스는 값을 비교하지만 일반 클래스는
		// equals 메서드를 오버라이딩 하여 재정의 하여 논리적 값을 비교하게 해야함
		
		Student Lee = new Student(100,"Lee");
		Student Lee2 = Lee;
		Student Shin = new Student(100,"Lee");
		
		
		System.out.println(Lee==Shin);
		System.out.println(Lee.equals(Shin)); //
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode()); // 논리적으로같다? 값이같다. 물리적으로 같다? 메모리 주소가 같다.
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println((i1.equals(i2)));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); // Integer 클래스의 hashCode는 오버라이딩 된것임, 이유 : i1의 값을 뱉음
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2)); // identifyHashCode로 실제 해시코드를 확인가능
		
		
	}

}
