package sec03.ex02;

public class OperqationsPromotionEx {

	public static void main(String[] args) {
		// 연산식에서의 자동타입 변환
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		//byte byteVal3 = byteVal1 + byteVal2; 컴파일 에러(허용범위 초과)
		int intVal1 = byteVal1 + byteVal2;
		System.out.println(intVal1);
		
		char charVal1 = 'A';
		char charVal2 = 1;
		//char charVal3 = charVal1 + charVal2; 컴파일 에러
		int intVal2 = charVal1 + charVal2;
		System.out.println("유니코드= "+ intVal2);
		System.out.println("출력문자=" +(char)intVal2);
		
		int intVal3 = 10;
		int intVal4 = intVal3/4;
		System.out.println(intVal4);
		
		int intVal5 = 10;
		//int intVal6 = 10/4.0; -컴파일 에러 (허용범위초과)
		double doubleVal = intVal5/4.0;
		System.out.println(doubleVal);
		
		int x = 1;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);
		

	}

}
