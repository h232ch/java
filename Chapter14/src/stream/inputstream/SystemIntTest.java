package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIntTest {

	public static void main(String[] args) {
		
		
		System.out.println("�Է�: ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i=isr.read()) != '��') { // �ѱ��� �ν��ϰ� �Ϸ��� inputstreamreader�� ���
				System.out.print((char)i); // ���� ������Ʈ���� �Ⱦ��� �νĸ��� (�������� 1����Ʈ�� �ν�, ���ڴ� 2����Ʈ�� �ν�)
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
