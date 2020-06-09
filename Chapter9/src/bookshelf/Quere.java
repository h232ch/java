package bookshelf;

public interface Quere {
	
	void enQueue(String title);
	String deQueue();
	
	int getSize();

}
