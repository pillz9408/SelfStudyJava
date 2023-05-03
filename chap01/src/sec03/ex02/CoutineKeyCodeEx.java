package sec03.ex02;

public class CoutineKeyCodeEx {

	public static void main(String[] args) throws Exception {
		//연속되는 키코드 읽기 예제
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");

	}

}
