package treeset;

import java.util.Comparator;


//public class Member implements Comparable<Member>{ compareTo ���Ĺ��
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
		return memberName + " ȸ������ ID�� "+memberId+" �Դϴ�.";
	}// ArrayList ���ʸ� Ÿ������ ������
	
	
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
	// hashset�� ����ϰ� hashet���� �ߺ��� �����ϱ� ���ؼ�
	// ���� ���� �ڵ带 ����� (memberId�� ����ũ�ϰ� ���ٴٴ� �ǹ���)
	// hashset���� �ش� �޼��带 �̿��Ͽ� ������ �񱳸� �����ϴµ�
	// �񱳽� equals �޼��带 ����Ͽ� �츮�� �̰��� �������̵��Ͽ� �ٲ��־���
	/*@Override
	public int compareTo(Member member) {
		//return (this.memberId - member.memberId);// TreeSet�� ���Ĺ��  (+) �������� (-) ��������
		return this.memberName.compareTo(member.getMemberName()); // �̸����� ���ĵ�
	} */
	@Override
	public int compare(Member member1, Member member2) { // member1 = this, member2 = �񱳴��
		return (member1.memberId - member2.memberId); //this-�񱳴�� = ���(��������), ����(��������)
	}
	
	
	
	
	
	

}
