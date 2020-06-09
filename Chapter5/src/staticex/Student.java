package staticex;

public class Student {
	
	private static int serialNum = 1000; // ����ƽ ���� �����̺����� ����.
	
	int studentId;
	String studentName; 
	
	public Student(int id, String name) {
		studentId = id; studentName = name;
		serialNum++;
		studentId = serialNum;
	}
	
	
	public int getStudentId() {
		return studentId;
	}


	public static int getSerialNum() {
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}


	public String getStudentName() { 
		// �ν��Ͻ� ������ ����ƽ �Լ� ������ ��� �Ұ� (�ν��Ͻ� ������ ������ �־�������� ����ƽ�� �׷�������)
		// ����ƽ ������ ��� ū���� ����ϸ� �ȵ�
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
	
	
}
