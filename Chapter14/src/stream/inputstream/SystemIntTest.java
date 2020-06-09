package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIntTest {

	public static void main(String[] args) {
		
		
		System.out.println("입력: ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i=isr.read()) != '끝') { // 한글을 인식하게 하려고 inputstreamreader를 사용
				System.out.print((char)i); // 위의 보조스트림을 안쓰면 인식못함 (기존것인 1바이트씩 인식, 문자는 2바이트씩 인식)
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
