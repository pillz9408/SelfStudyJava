package sec03.ex03;

public class OperatorExQuiz10 {

	public static void main(String[] args) {
		/*
		 반지름이 10인 원의 넓이를 구하는데 다음과 같이 var2,".",var3을 +연산해서 원주율을 얻은다음 계산하려고합니다.
		 올바른 결과가 나오도록 코드를 수정해보세요.
		 
		 int var1 = 10;
		 int var2 = 3;
		 int var3 = 14;
		 double var4 = var1 * var1 * var2 + "." +var3;
		 System.out.println("원의 넓이" +var4);
		 */
		int var1 = 10;
		 int var2 = 3;
		 int var3 = 14;
		 double var4 = var1 * var1 * Double.parseDouble(var2 + "." +var3);
		 System.out.println("원의 넓이" +var4);
	}

}
