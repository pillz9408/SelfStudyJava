package sec03.ex07;

public class Car {
	//필드
	Tire frontLeftT = new Tire("앞왼쪽",6);
	Tire frontRightT = new Tire("앞오른쪽",2);
	Tire backLeftT = new Tire("뒤왼쪽",3);
	Tire backRightT = new Tire("뒤오른쪽",4);
	
	//생성자
	//메소드
	int run() { //각 Tire객체의 roll() 메소드 호출, false를 리턴하는 roll()이있을 경우 stop()메소드 호출
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftT.roll()==false) {stop(); return 1;}
		if(frontRightT.roll()==false) {stop(); return 2;}
		if(backLeftT.roll()==false) {stop(); return 3;}
		if(backRightT.roll()==false) {stop(); return 4;}
		return 0;	
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
