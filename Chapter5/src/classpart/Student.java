package classpart;

public class Student {
	
	public int studentId;
	public String studentName;
	public String address; // �̷��� Ŭ���� �� ������ �������, �Ӽ����� �Ҹ�
	
	
	public void showStudentInfo() {
		int i = 0;
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}

}
