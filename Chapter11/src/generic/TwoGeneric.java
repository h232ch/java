package generic;

public class TwoGeneric<T, V> {
	
	T x; V y;
	
	TwoGeneric (T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}

}
