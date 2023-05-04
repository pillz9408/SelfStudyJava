package sec03.ex07;

public class KumhoTire extends Tire {
	//field
	//instance
	public KumhoTire(String location, int maxR) {
		super(location, maxR);
	}
	//method

	@Override
	public boolean roll() {
		++accR;
		if(accR<maxR) {
			System.out.println(location+"금호타이어 수명: "+ (maxR-accR)+"회");
			return true;
		}else {
			System.out.println("*** " + location + "금호타이어 펑크 ***");
			return false;
		}
	}
}
