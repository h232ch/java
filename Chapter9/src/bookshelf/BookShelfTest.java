package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quere bookQueue = new BookShelf();
		bookQueue.enQueue("ลยน้ป๊ธฦ1");
		bookQueue.enQueue("ลยน้ป๊ธฦ2");
		bookQueue.enQueue("ลยน้ป๊ธฦ3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
	}

}
