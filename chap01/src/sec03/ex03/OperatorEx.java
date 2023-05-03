package sec03.ex03;

public class OperatorEx {
	public static void main(String[] args) {
		// 연산식
		int a = 1;
		int b = 2;
		
		int result1 = a + b;
		int result2 = a - b;
		int result3 = a * b;
		int result4 = a / b;
		int result5 = a % b;
		System.out.println("1= "+ result1 + ", 2=" +result2 +",3 =" +result3 + ",4 =" +result4 +
				",5=" +result5);
		
		//논리연산
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요");
		}
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군요");
		}
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("대문자군요");
		}
		
		int val = 6;
		
		if((val%2==0) | (val%3 == 0)) {
			System.out.println("2또는 3의 배수군요");
		}
		if((val%2==0) || (val%3==0)) {
			System.out.println("2또는 3의 배수군요");
		}
		//대입 연산자
		int result = 0;
		result += 10;
		System.out.println("result=" +result);
		result -=5;
		System.out.println("result=" +result);
		result *=3;
		System.out.println("result=" +result);
		result /=5;
		System.out.println("result=" +result);
		
		//삼항 연산자(조건 연산자)
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B': 'C');
		System.out.println(score+"점은 " + grade + "등급입니다.");
		
		

		
	}

}
