package lamda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x,y)->(x>=y)?x:y; //x,y두개가 넘어온다. 그중 더큰 숫자를 반환해 줘라
		System.out.println(max.getMaxNumber(10, 20)); //람다식은 좀더 공부해야함

	}

}
