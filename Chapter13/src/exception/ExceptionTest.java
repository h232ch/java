package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt"); // a.txt가 없다면 예외 발생
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			try {
				fis.close(); // 널포인트 익셉션 발생. 
				System.out.println("finnaly");
			} catch (Exception e) { 
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
