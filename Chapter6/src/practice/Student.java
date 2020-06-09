
package practice;

import java.util.ArrayList;

public class Student {
	
	String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>(); //�߿��� �κ�
	}
	
	public void bookSet(String bookName) {
		Book book = new Book(bookName);
		bookList.add(book);
	}

	public void showInfo() {
		System.out.print(studentName+" �л��� ���� å�� : ");
		for(Book b : bookList) {
			System.out.print(b.getBookName()+" ");
		}System.out.print("�Դϴ�."); System.out.println("");
	}
}
