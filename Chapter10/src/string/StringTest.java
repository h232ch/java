package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = "abc";
		
		System.out.println(str1==str2); // str1 -> Heap�޸𸮸� �ٶ� str2 -> ���(���ͷ�)�� �ٶ�
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3==str4); // ���Ǯ�� �����پ� -> str3, str4 -> �ϳ��� ����� �ٶ�
	}

}
