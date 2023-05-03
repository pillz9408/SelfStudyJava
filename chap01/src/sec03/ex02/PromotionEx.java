package sec03.ex02;

public class PromotionEx {

	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("byte int 변환"+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("char int 변환"+intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("int long 변환"+longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("long float 변환"+floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("float double 변환"+doubleValue);
	}

}
