package sec03.ex05;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 배열의 length 필드 예제
		int scores[]= {83,90,87};
		int sum = 0;
		
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("sum: " + sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("avg: " + avg);
	}

}
