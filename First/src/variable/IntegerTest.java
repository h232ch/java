package variable;

public class IntegerTest {
	
	public static void main(String args[]) {
		
		byte bs = -128;
		byte bs2 = 127;
		System.out.println(bs);
		System.out.println(bs2);
		
		//byte bs = 128; 오류 발생
		//byte bs = -129; 오류 발생
		
		//int lVal = 12345678900; 이렇듯 자바에서는 숫자의 범위(메모리범위)를 관리함 -> Literal
		long lVal = 12345678900L; // 자바는 기본적으로 숫자는 int형으로 취급 Long 형사용시 뒤에 L기입 중요
		
		// byte = 1 (-2^7 ~2^7-a), Short = 2(-2^15~2^15-1), int=4(-2^31~2^31-1)...
		
	}

}
