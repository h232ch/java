package practice;

public class Card {
	
	private int cardNumber;
	private static int cardSerial = 10000;
	// 스태틱으로 선언하지 않으면 계속 1001이 나올것임
	// 스태틱을 사용하는 이유는 값을 유니크하게 사용하기 위함
	
	
	Card() {
		cardSerial++;
		cardNumber=cardSerial;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
}
