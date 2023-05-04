package sec03.ex07;

public class Tire {
	//필드
	public int maxR;
	public int accR;
	public String location;
	
	//생성자
	public Tire(String location, int maxR) {
		this.location = location;
		this.maxR = maxR;
	}
	
	//메소드
	public boolean roll() {
		++accR;
		if(accR<maxR) {
			System.out.println(location + "Tire 수명: " + (maxR-accR)+ "회" );
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}

}
