package staticex;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"Lee"); //������� ��
		//System.out.println(Student.serialNum);
		
		Student studentKim = new Student(200,"Kim");
		//System.out.println(Student.serialNum); // ����ƽ ������ ȣ���� Ŭ���� �̸����� �Ѵ�.
		
		System.out.println(studentLee.getStudentId());
		System.out.println(studentKim.getStudentId());
		
	}

}
