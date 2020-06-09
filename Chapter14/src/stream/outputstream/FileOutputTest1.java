package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
	
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){ //�ڿ� true�� ��� ��� ���ҵ���
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
