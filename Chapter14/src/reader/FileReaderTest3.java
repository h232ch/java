package reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderTest3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis); // 바이트로 읽은것은 Reader로 변환
		
		int i;
		
		while((i=isr.read())!=-1) {
			System.out.print((char)i); //한글이 잘 나옴 (InputStreamReader)
		}
		
		fis.close();
	}

}
