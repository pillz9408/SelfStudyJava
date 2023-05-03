package sec03.ex04;

public class WhileSumEx {

	public static void main(String[] args) {
		// while문이용 1~100까지의 합
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~ "+(i-1)+"합: "+ sum);
	}

}
