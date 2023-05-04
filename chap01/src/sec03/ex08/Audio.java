package sec03.ex08;import java.rmi.Remote;

public class Audio implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		// turnOn() 메소드 구현
		System.out.println("turn on Audio");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off Audio");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("Volume: " + volume);
	}
	

}
