package array;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		Student studentKim = new Student(1002, "Kim");
		
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 60);
		studentLee.addSubject("������", 100);
		
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 28);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}

}
