package sec03.ex05;

public class ArrayQuiz04 {

	public static void main(String[] args) {
		// for 문을 이용해 배열의 항목에서 최대값을 구해보세요.
		int max =0;
		int array[] = {1,5,3,8,2};
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max = " + max);

	}

}
