package sec03.ex06;

public class Computer {
	int sum1(int[] values) { //매개변수를 모를경우 매개변수를 배열로 선언
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ...values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}	
}
