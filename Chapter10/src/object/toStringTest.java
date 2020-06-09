package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class toStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리");
		System.out.println(book); //메모리 주소가 나옴 -> 오버라이딩하여 메모리 주소의 참조값이 아닌 author + "," + title이 이나옴
		
		String str = new String("토지");
		System.out.println(str); //문자열이 출력됨 -> String 클래스는 JDK 클래스, String 클래 내에 toString 메서드가 불러지는 것임
		System.out.println(str.toString());//어떤 객체의 정보를 스트링 현태로 표현해야 할때 사용 -> 값을 받아서 문자열로 출력
		
		String a = "test";
		System.out.println(a);
		String b = new String("test");
		System.out.println(b);
		
		//toString() 메서드 원형 : getClass().getName()+'@'+Integer.toHexString(hashcode());
		
		Book book1 = new Book("토지", "박경리");
		System.out.println(book1);
		Book book2 = (Book)book.clone(); // book 클래스에 implements Cloneable 을 꼭해줘야 가능함
		System.out.println(book2);
		System.out.println(System.identityHashCode(book1)); 
		System.out.println(System.identityHashCode(book2)); // 논리적 복사 Clone
	}

}
