package sec03.ex04;

public class BreakEx {

	public static void main(String[] args) {
		// Break 예제
		while(true) {
			int num =(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("End");
	}

}
