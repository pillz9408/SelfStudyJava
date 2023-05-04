package sec03.ex07;

public class CarEx {

	public static void main(String[] args) {
		//Tire, Car, HankookTire, KumhoTire 실행 클래스
		Car car = new Car(); //Car객체생성
		
		for(int i=1; i<=5; i++) {  //car 객체의 run()메소드 5회 반복 실행
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 한국타이어로 교체");
					car.frontLeftT = new HankookTire("앞왼쪽", 15);
					break;
				
				case 2:
					System.out.println("앞오른쪽 금호타이어로 교체");
					car.frontRightT = new KumhoTire("앞오른쪽", 13);
					break;
					
				case 3:
					System.out.println("뒤왼쪽 한국타이어로 교체");
					car.backLeftT = new HankookTire("뒤왼쪽", 14);
					break;
				
				case 4:
					System.out.println("뒤오른쪽 금호타이어로 교체");
					car.backRightT = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("---------------------------------------"); //1회전시 출력되는 내용구문
			
			
		}
		

	}

}
