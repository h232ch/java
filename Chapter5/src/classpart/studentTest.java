package classpart;

public class studentTest {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.address="Suwon";
		student.studentName="Sehwan";
		student.showStudentInfo();
		
		
		Student studentKim = new Student();
		studentKim.studentName = "SehwanKim";
		studentKim.address = "Osan";
		
		
		System.out.println(student);
		System.out.println(studentKim);
		
		
	}

}
