package practice;

public class Card {
	
	private int cardNumber;
	private static int cardSerial = 10000;
	// ����ƽ���� �������� ������ ��� 1001�� ���ð���
	// ����ƽ�� ����ϴ� ������ ���� ����ũ�ϰ� ����ϱ� ����
	
	
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
