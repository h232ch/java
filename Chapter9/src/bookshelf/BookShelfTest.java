package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quere bookQueue = new BookShelf();
		bookQueue.enQueue("�¹���1");
		bookQueue.enQueue("�¹���2");
		bookQueue.enQueue("�¹���3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
	}

}
