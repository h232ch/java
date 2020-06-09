package generic;

public class Plastic extends Meterial{

	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 프링팅 입니다.");
	}
	
}
