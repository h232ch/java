package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
	
	public Class loadCladd(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); //�޼��忡�� ���� ó���� �̷�� ȣ���ϴ� ������ ó���ϰ� ��
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
	
		ThrowsException2 test = new ThrowsException2();
		try {
			test.loadCladd("a.txt", "java.lang.string");
		} catch (FileNotFoundException | ClassNotFoundException e) { //�������� ���ܸ� ���ÿ� ó��
			System.out.println(e);
		}
	}
	

}
