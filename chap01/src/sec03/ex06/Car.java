package sec03.ex06;

public class Car {//class
	//field
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자
	Car(){
		
	}
	//생성자
	Car(String model){
		this(model, "은색", 250); //this()를 통해 다른 생성자 호출
	} 
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model; 
		this.color = color;
		this.maxSpeed = maxSpeed; //공통 실행 코드, 생성자 오버로딩
	}

}
