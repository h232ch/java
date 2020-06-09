package generic;

public class GenericPrinter<T extends Meterial>{ // extends Meterial로 Meterial을 extends 받지않은 클래스는 받지않도록 함
	//상위 추상 클래스에 기능을 넣어서 T 타입의 인스턴스가 기능을 사용할 수 있게함
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // 추가된 기능
	}

}
