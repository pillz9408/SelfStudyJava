package sec03.ex08;

public class Televison implements RemoteControl{
	//필드
	private int volume;
	
	@Override
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("turn On TV");
	}
	
	@Override
	// turnoff() 추상 메소드의 실체 메소드
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("turn off TV");
	}
	@Override
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("TV Volume: "+ this.volume);
		
	}

}
