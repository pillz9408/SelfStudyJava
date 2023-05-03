package sec03.ex04;

public class ForExQuiz02 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 100까지의 정수중 3의 배수의 총합을 구하는 코드를 작성해보시오
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;			
			}	
		}
		System.out.println(sum);
	}

}
