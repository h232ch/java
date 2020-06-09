package practice;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Kimsehwan");
		
		s1.bookSet("test");
		s1.bookSet("test1");
		s1.bookSet("test2");
		s1.bookSet("test3");
		s1.bookSet("test4");
		s1.bookSet("test5");
		
		Student s2 = new Student("Kimsehwan");
		
		s2.bookSet("test");
		s2.bookSet("test1");
		s2.bookSet("test2");
		s2.bookSet("test3");
		s2.bookSet("test4");
		s2.bookSet("test5");
		
		
		s1.showInfo();
		s2.showInfo();
		
	}
}
