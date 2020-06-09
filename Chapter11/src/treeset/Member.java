package treeset;

import java.util.Comparator;


//public class Member implements Comparable<Member>{ compareTo 정렬방식
public class Member implements Comparator<Member>{
	
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
	public String toString() {
		return memberName + " 회원님의 ID는 "+memberId+" 입니다.";
	}// ArrayList 제너릭 타입으로 구성됨
	
	
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}
	// hashset을 사용하고 hashet내의 중복을 제거하기 위해서
	// 위와 같은 코드를 써야함 (memberId를 유니크하게 쓰곘다는 의미임)
	// hashset에서 해당 메서드를 이용하여 물리적 비교를 수행하는데
	// 비교시 equals 메서드를 사용하여 우리는 이것을 오버라이딩하여 바꿔주었다
	/*@Override
	public int compareTo(Member member) {
		//return (this.memberId - member.memberId);// TreeSet의 정렬방식  (+) 오름차순 (-) 내림차순
		return this.memberName.compareTo(member.getMemberName()); // 이름으로 정렬됨
	} */
	@Override
	public int compare(Member member1, Member member2) { // member1 = this, member2 = 비교대상
		return (member1.memberId - member2.memberId); //this-비교대상 = 양수(오름차순), 음수(내림차순)
	}
	
	
	
	
	
	

}
