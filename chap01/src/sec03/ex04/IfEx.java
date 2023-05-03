package sec03.ex04;

public class IfEx {

	public static void main(String[] args) {
		// if 문 예제
		int score = 90;
		
		if(score>=90) {
			System.out.println("A");
		}
		if(90>score)
			System.out.println("B");
			System.out.println("등급입니다"); //중괄호 블럭이 없어 들여쓰기만 되었을뿐 if문과 관계가 없다.
	}

}
