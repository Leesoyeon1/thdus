package interfaces;

public class Television implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
	System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = volume;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
				
			}else {
				this.volume = volume;
			}
		}
		this.volume=volume;
		
	}

}
