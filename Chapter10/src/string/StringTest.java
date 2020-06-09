package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = "abc";
		
		System.out.println(str1==str2); // str1 -> Heap메모리를 바라봄 str2 -> 상수(디터럴)을 바라봄
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3==str4); // 상수풀에 가져다씀 -> str3, str4 -> 하나의 상수를 바라봄
	}

}
