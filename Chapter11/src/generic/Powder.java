package generic;

public class Powder extends Meterial{

	@Override
	public String toString() {
		return "재료는 파우더 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 프링팅 입니다.");
	}
}
