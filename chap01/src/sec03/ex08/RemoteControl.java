package sec03.ex08;

public interface RemoteControl {
	
	// 상수 필드 선언 : public static final이 자동을로 붙게된다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 : 메소드 선언부만 작성
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
