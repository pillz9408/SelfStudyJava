package sec03.ex05;

public class StringEqualsEx {

	public static void main(String[] args) {
		// 참조 타입과 참조 변수 string 예제
		String strVar1 = "가나다";
		String strVar2 = "가나다";
		
		if(strVar1==strVar2) {
			System.out.println("same");
		}else {
			System.out.println("diffrent");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("same sentence");
		}
		String StrVar3 = new String("가나다");
		String StrVar4 = new String("가나다");
		
		if(StrVar3==StrVar4){
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		if(StrVar3.equals(StrVar4)) {
			System.out.println("same sentence");
		}

	}

}
