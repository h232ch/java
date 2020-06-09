package thread;

import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> books = new ArrayList<String>();
	public FastLibrary() {
		books.add("추격자1");
		books.add("추격자2");
		books.add("추격자3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while(books.size()==0) {
			System.out.println(t.getName()+" waiting start");
			wait();
			System.out.println(t.getName()+" waiting end");
		}
		String title = books.remove(0);
		System.out.println(t.getName()+":"+title+" lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		
		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll();
		System.out.println(t.getName()+":"+title+" return");
	}
}

class Student extends Thread{
	public void run() {
		try {
			sleep(5000);
			String title = LibraryMian.library.lendBook();
			if(title == null) return;
			LibraryMian.library.returnBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryMian {
	public static FastLibrary library = new FastLibrary();
	public static void main(String[] args) {	
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();

	}

}
