package sec03.ex05;

public class AdvancedForEx {

	public static void main(String[] args) {
		//향상된 for문 예제
		int scores[] = {95,71,84,93,87};
		int sum = 0;
		
		for(int score:scores) {
			sum = sum+score;
		}
		System.out.println("sum: " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("avg: "+ avg);
	}

}
