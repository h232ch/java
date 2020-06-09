package practice;

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate md1 = new MyDate(2019, 12, 31);
		MyDate md2 = new MyDate(2019, 12, 31);
		
		System.out.println(md1.year+"-"+md1.month+"-"+md1.day);
		System.out.println(md2.year+"-"+md2.month+"-"+md2.day);
		
		System.out.println(md1.equals(md2));
		System.out.println(md1.hashCode());
		System.out.println(md2.hashCode());
	}

}
