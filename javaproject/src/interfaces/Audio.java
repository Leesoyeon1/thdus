package interfaces;

public class Audio implements RemoteControl{
	int volume;

	@Override
	public void turnOn() {//remotecontrol 인터페이스에서 추상메소드를 구현
		System.out.println("audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}
	

}
