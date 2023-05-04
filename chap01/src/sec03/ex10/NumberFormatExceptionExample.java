package sec03.ex10;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// NumberFormatException 예제
		String data1="100";
		String data2 = "a100"; //data2의 "a100"의 a를 숫자로 변환 불가하기에 생기는 오류
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(result);
				

	}

}
