package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length>=s2.getBytes().length){
			return s1;
		}else {
			return s2;
		}
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요", "hello", "Good morning", "반값습니다."};
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{ // 람다식을 이용해 직접 내용을 생성하여 호출
			if(s1.getBytes().length>=s2.getBytes().length){
				return s1;
			}else {
				return s2;
			}
		}));
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get()); //BinaryOperation을 활용한 호출
	}

}
