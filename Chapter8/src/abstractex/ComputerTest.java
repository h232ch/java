package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Desktop();
		computer.turnOn();
		computer.display();
		computer.turnOff();
		
		Computer notebook = new MyNotebook();
		computer.turnOn();
		notebook.display();
		notebook.type();
		notebook.turnOff();
		
		//Notebook notebook2 = new Notebook(); �ʱ�ȭ �Ұ��� Notebook�� �߻�Ŭ������ �ν��Ͻ�ȭ �ɼ�����.
		
		Notebook notebook2 = new MyNotebook();
		notebook2.turnOn();
		notebook2.display();
		notebook2.type();
		notebook2.turnOff();

	}

}