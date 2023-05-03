package sec03.ex04;

public class ForEx {

	public static void main(String[] args) {
		//for문
		int sum = 0; 
		
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합 = "+sum);
		
		/*
		 int sum = 0;
		 int i = 0;
		 
		 for(i=1; i<=100; i++){
		 	sum+=i;
		 }
		 System.out.print("1~"+(i-1)+"합 :" + sum)
		 */
	}

}
