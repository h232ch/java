package staticex;

public class Student {
	
	private static int serialNum = 1000; // 스태틱 값은 프라이빗으로 쓴다.
	
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
		// 인스턴스 변수는 스태틱 함수 내에서 사용 불가 (인스턴스 변수는 참조가 있어야하지만 스태틱은 그렇지않음)
		// 스태틱 변수의 경우 큰값을 사용하면 안됨
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
	
	
}
