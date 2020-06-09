package classpart;

public class Student {
	
	public int studentId;
	public String studentName;
	public String address; // 이러한 클래스 내 변수를 멤버변수, 속성으로 불림
	
	
	public void showStudentInfo() {
		int i = 0;
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}

}
