package sec03.ex03;

import java.util.Scanner;

public class OperatorExQuiz9 {

	public static void main(String[] args) {
		/* 키보드로 두 실수를 입력받고 입력된 첫번째 수에 두번째 수를 나눈 결과를 "결과:값" 으로 출력하되
		두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를 작성하시오
		첫번째 수 = 7.3 , 두번째 수 = 2.5
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		double num1 = Double.parseDouble(scanner.next());
		System.out.print("두번째 수:");
		double num2 = Double.parseDouble(scanner.next());
		
		System.out.println("----------------");
		if(num2 != 0.0) {
			System.out.println("결과: " +(num1/num2));
		}else {
			System.out.println("결과: 무한대");
		}
		
		
		

	}

}
