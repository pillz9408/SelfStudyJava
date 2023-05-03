package sec03.ex02;

public class CastingEx {

	public static void main(String[] args) {
		//강제 타입 변환 예제
		int intVal = 44032;
		char charVal = (char)intVal;
		System.out.println(charVal);
		
		long longVal = 500;
		intVal = (int)longVal;
		System.out.println(intVal);
		
		double doubleVal = 3.14;
		intVal = (int)doubleVal;
		System.out.println(intVal);
		
	}

}
