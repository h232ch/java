package writer;

import java.io.FileWriter;
import java.io.IOException;

public class FIeWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("wirter.txt", true);
		fw.write('A');
		
		char[] buf = {'B','C','D','E','F'};
		
		fw.write(buf);
		fw.write("�ȳ��ϼ���?");
		
		fw.write(buf, 2, 2);
		fw.close();
		
		System.out.println("end");
	}

}
