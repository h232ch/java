package lamda;

@FunctionalInterface // 함수형 인터페이스라고 알려줌 , 이 인터페이스는 한개만 사용할 수있다.
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);

}
