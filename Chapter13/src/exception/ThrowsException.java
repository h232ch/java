package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadCladd(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); //�޼��忡�� ���� ó���� �̷�� ȣ���ϴ� ������ ó���ϰ� ��
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
	
		ThrowsException test = new ThrowsException();
		try {
			test.loadCladd("a.txt", "java.lang.string");
			//test.loadCladd("b.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (Exception e) { //�ֻ��� �ͼ����� �������� ��, �ֻ��� �����̱⋚���� �����߻��� �ʽ� �ɸ�
			System.out.println(e);
		}
	}

}
