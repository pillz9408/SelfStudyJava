package sec03.ex11;

public class ExitEx {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i ==5) {
				System.exit(0);
				//break; 뒤 라인을 실행시켜야할때는 exit()대신 break 사용
			}
		}
		System.out.println("last Code");

	}

}
