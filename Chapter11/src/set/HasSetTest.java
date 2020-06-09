package set;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("Lee");
		set.add("kim");
		set.add("oh");
		set.add("oh"); // 중복을 허용하지 않음
		System.out.println(set); //정렬이 안된 상태로 모든값을 뱉어냄
		// id, 주민번호, 학번, 사번들을 관리할 때 이아이를 쓰면됨
		
		Iterator<String> ir = set.iterator(); // 순서대로 출력하려면 이것을 써야함 컬랙션 형은 모두 사용가능
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str); // 순서대로 출력함
		}
		
	}

}
