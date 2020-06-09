package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if(userID==null) {
			throw new IDFormatException("���̵�� null�ϼ� �����ϴ�.");
		}else if( userID.length() <8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ͽ��� �մϴ�.");
		}else {
			this.userID = userID;
		}
		
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String id = null;
		try {
			test.setUserID(id);
		} catch (IDFormatException e) {
			System.out.println(e); // Ŀ���� �ͼ��� �� �޼����� ����
		}
		
		id = "123456";
		try {
			test.setUserID(id);
		} catch (IDFormatException e) {
			System.out.println(e); // Ŀ���� �ͼ��� �� �޼����� ����
		}
		
	}

}
