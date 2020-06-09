package object;


class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { // �Ű����� Student �Է½� Upcasting �߻�
		if(obj instanceof Student) {
			Student std = (Student)obj; // Student std�� obj �ν��Ͻ��� ���� Down casting
			return (this.studentNum == std.studentNum); // StudentNum(�ڽ�)�� stdNum(����)�� ��
		}else {
			return false;
		}
	}


	@Override
	public int hashCode() {
		
		return studentNum; // �ؽ��ڵ带 studentNum���� ����
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // �޸𸮸� �� (������ ��)
		System.out.println(str1.equals(str2)); // �ν��Ͻ� ��������� ���� �� (���� ��) -> ��Ʈ�� Ŭ������ ���� �������� �Ϲ� Ŭ������
		// equals �޼��带 �������̵� �Ͽ� ������ �Ͽ� ���� ���� ���ϰ� �ؾ���
		
		Student Lee = new Student(100,"Lee");
		Student Lee2 = Lee;
		Student Shin = new Student(100,"Lee");
		
		
		System.out.println(Lee==Shin);
		System.out.println(Lee.equals(Shin)); //
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode()); // �������ΰ���? ���̰���. ���������� ����? �޸� �ּҰ� ����.
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println((i1.equals(i2)));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); // Integer Ŭ������ hashCode�� �������̵� �Ȱ���, ���� : i1�� ���� ����
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2)); // identifyHashCode�� ���� �ؽ��ڵ带 Ȯ�ΰ���
		
		
	}

}
