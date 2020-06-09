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
		
		Book book = new Book("����", "�ڰ渮");
		System.out.println(book); //�޸� �ּҰ� ���� -> �������̵��Ͽ� �޸� �ּ��� �������� �ƴ� author + "," + title�� �̳���
		
		String str = new String("����");
		System.out.println(str); //���ڿ��� ��µ� -> String Ŭ������ JDK Ŭ����, String Ŭ�� ���� toString �޼��尡 �ҷ����� ����
		System.out.println(str.toString());//� ��ü�� ������ ��Ʈ�� ���·� ǥ���ؾ� �Ҷ� ��� -> ���� �޾Ƽ� ���ڿ��� ���
		
		String a = "test";
		System.out.println(a);
		String b = new String("test");
		System.out.println(b);
		
		//toString() �޼��� ���� : getClass().getName()+'@'+Integer.toHexString(hashcode());
		
		Book book1 = new Book("����", "�ڰ渮");
		System.out.println(book1);
		Book book2 = (Book)book.clone(); // book Ŭ������ implements Cloneable �� ������� ������
		System.out.println(book2);
		System.out.println(System.identityHashCode(book1)); 
		System.out.println(System.identityHashCode(book2)); // ���� ���� Clone
	}

}
