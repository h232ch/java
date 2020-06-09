package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException { //인터페이스의 대표적이 예제
		
		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객 우선 숙련도 높은 상담원");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' ||ch== 'r') {
			scheduler = new RoundRobin();
		}else if (ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}else if(ch=='P'||ch=='p') {
			scheduler = new Priority();
		}else {
			System.out.println("다시 선택해주세요.");
		}
		
		//상속받은 클래스에서 상세 기능을 수행함
		//제어부(화면부)에서 누르면 해당 내용이 실행되게끔함 
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
