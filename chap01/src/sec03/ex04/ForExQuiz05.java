package sec03.ex04;

public class ForExQuiz05 {

	public static void main(String[] args) {
		/* for문이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
		*
		**
		***
		**** 
		*/
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
