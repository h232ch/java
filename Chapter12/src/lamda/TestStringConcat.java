package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl(); //�Ϲݽ����� ����
		impl.makeString("hello", "world"); 
		
		StringConcat concat = (s,v)->System.out.println(s+","+v);
		concat.makeString("hello" , "world"); //���ٽ� ����
		
		StringConcat concat2 = new StringConcat() { //���ٽ��� ������ ��ϸӽ� ���� Ŭ���� ���·� ������
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
			}};
		concat2.makeString("test", "test");
	}
	
}
