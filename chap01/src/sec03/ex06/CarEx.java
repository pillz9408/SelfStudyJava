package sec03.ex06;

public class CarEx {
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("Maker: " + myCar.company);
		System.out.println("Model: " + myCar.model);
		System.out.println("Color: " + myCar.color);
		System.out.println("Max Speed: " + myCar.maxSpeed);
		System.out.println("Current Speed: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("Modified Speed: " + myCar.speed);
		
	}

}
