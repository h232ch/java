package reference;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("국어", 80);
		studentLee.setMathSubject("수학", 100);
		
		Student studentKim = new Student(20,"Kim");
		studentKim.setKoreaSubject("국어", 60);
		studentKim.setMathSubject("수학", 20);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
