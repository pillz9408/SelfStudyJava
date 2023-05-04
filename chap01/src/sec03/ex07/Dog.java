package sec03.ex07;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		//추상 메소드 재정의, 재정의 하지 않는다면 컴파일 에러
		System.out.println("멍멍으르릉왈왈 컹컹");
		
	}
	
	

}
