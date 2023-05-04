package sec03.ex07;

public class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		//추상 메소드 재정의
		System.out.println("냐옹");
		
	}
	
	

}
