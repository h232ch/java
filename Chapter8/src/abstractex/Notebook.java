package abstractex;

public abstract class Notebook extends Computer{
	
	// 하나만 구성할 경우 하위 클래스를 abstrct로 만들어 줘야 함
	// 하나만 구현할 경우 Notebook을 상속형으로 만들어줌 그리고 하위클래스 하나를 더 만들어서 노트북 클래스를 상속받아 쓰게함
	// 제품의 뎁스 수준에 맞추어 적절히 사용
	
	public void type() {
		System.out.println("NoteBook Type");
	}
}
