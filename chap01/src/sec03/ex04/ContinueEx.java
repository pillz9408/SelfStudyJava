package sec03.ex04;

public class ContinueEx {

	public static void main(String[] args) {
		// Continue 예제
		for(int i=1;i<=10; i++ ) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
