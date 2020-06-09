package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException { //�������̽��� ��ǥ���� ����
		
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� �� �켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' ||ch== 'r') {
			scheduler = new RoundRobin();
		}else if (ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}else if(ch=='P'||ch=='p') {
			scheduler = new Priority();
		}else {
			System.out.println("�ٽ� �������ּ���.");
		}
		
		//��ӹ��� Ŭ�������� �� ����� ������
		//�����(ȭ���)���� ������ �ش� ������ ����ǰԲ��� 
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
