package collection;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() { // toString을 오버라이딩하여 this 호출시 해당값을 돌려주게함
		return memberName + " 회원님의 ID는 "+memberId+" 입니다.";
	} //ArrayList 제너릭 타입으로 구성됨
}
