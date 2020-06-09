package array;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		Student studentKim = new Student(1002, "Kim");
		
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 60);
		studentLee.addSubject("성교육", 100);
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("영어", 28);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}

}
