package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if(userID==null) {
			throw new IDFormatException("아이디는 null일수 없습니다.");
		}else if( userID.length() <8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하여야 합니다.");
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
			System.out.println(e); // 커스텀 익셉션 널 메세지가 보임
		}
		
		id = "123456";
		try {
			test.setUserID(id);
		} catch (IDFormatException e) {
			System.out.println(e); // 커스텀 익셉션 널 메세지가 보임
		}
		
	}

}
