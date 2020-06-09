package staticex;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"Lee"); //멤버변수 힙
		//System.out.println(Student.serialNum);
		
		Student studentKim = new Student(200,"Kim");
		//System.out.println(Student.serialNum); // 스태틱 변수의 호출은 클래스 이름으로 한다.
		
		System.out.println(studentLee.getStudentId());
		System.out.println(studentKim.getStudentId());
		
	}

}
