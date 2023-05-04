package sec03.ex07;

public class HankookTire extends Tire{
	//필드
	//생성자
	public HankookTire(String location, int maxR) {
		super(location,maxR);
	}
	//메소드
	@Override
	public boolean roll() {
		++accR;
		if(accR<maxR) {
			System.out.println(location + "한국타이어 수명: " + (maxR-accR)+ "회");
			return true;
		}else {
			System.out.println("***"+ location + "한국타이어 펑크 ***");
			return false;
		}
		
	}

}
