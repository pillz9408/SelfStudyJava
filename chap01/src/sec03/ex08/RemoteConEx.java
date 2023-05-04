package sec03.ex08;

public class RemoteConEx {

	public static void main(String[] args) {
		// 인터페이스 변수에 구현 객체 대입
		RemoteControl rc;
		rc = new Televison();
		rc = new Audio();
		
	}

}
