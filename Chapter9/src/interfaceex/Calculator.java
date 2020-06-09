package interfaceex;

public abstract class Calculator implements Calc{ // 추상 메서드를 상속받는 extends와 다르게 interface를 사용함

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	/*
	@Override
	public int times(int num1, int num2) {
		return 0;
	}
	
	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String stringAdd(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	} 이렇게 삭제된 메서드는 추상 메서드가 됨*/

}
