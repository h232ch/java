package string;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java)); //���� Java�� ������ Java�� ���ο� �޸𸮸� ���´�. ���ο� ���� �߰��ɋ����� �޸� ����
		// �̴� �޸� ���� �ǹ��ϸ� Stringbuffer Ȥ�� Stringbuilder�� ����Ѵ�.
		System.out.println(java);
		
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		
		java = buffer.toString();
		System.out.println(System.identityHashCode(buffer)); // ���� Buffer�� �޸𸮰� ���� �׷��� android�� �߰��Ǿ���. �޸� ���� ����
		
		System.out.println(java);
		
		
	}

}
