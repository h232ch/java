package reference;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("����", 80);
		studentLee.setMathSubject("����", 100);
		
		Student studentKim = new Student(20,"Kim");
		studentKim.setKoreaSubject("����", 60);
		studentKim.setMathSubject("����", 20);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
