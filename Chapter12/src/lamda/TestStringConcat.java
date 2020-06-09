package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl(); //일반식으로 구현
		impl.makeString("hello", "world"); 
		
		StringConcat concat = (s,v)->System.out.println(s+","+v);
		concat.makeString("hello" , "world"); //람다식 구현
		
		StringConcat concat2 = new StringConcat() { //람다식은 실제로 어나니머스 내부 클래스 형태로 구현됨
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
			}};
		concat2.makeString("test", "test");
	}
	
}
