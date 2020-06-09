package array;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5]; // Book을 어레이형태로 인스턴스화!
		
		
		library[0] = new Book("태백산맥","김세환");
		library[1] = new Book("태백산","김또깡");
		library[2] = new Book("태백","김세발");
		library[3] = new Book("태","김세수");
		library[4] = new Book("태평양","김세지");
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]); //각 값의 주소값이 들어가 있음 각 배열은 하나의 인스턴스임 클래스 변수임
			library[i].showBookInfo(); 		//해당 배열 인스턴스의 메서드를 이용하여 값 호출
		}
		
		

	}

}
