package string;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java)); //기존 Java와 변경한 Java는 새로운 메모리를 같는다. 새로운 값이 추가될떄마다 메모리 변경
		// 이는 메모리 낭비를 의미하며 Stringbuffer 혹은 Stringbuilder를 써야한다.
		System.out.println(java);
		
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		
		java = buffer.toString();
		System.out.println(System.identityHashCode(buffer)); // 위의 Buffer와 메모리값 동일 그러나 android는 추가되었다. 메모리 낭비가 없음
		
		System.out.println(java);
		
		
	}

}
