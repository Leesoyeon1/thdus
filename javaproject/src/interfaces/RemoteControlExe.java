package interfaces;

class DvdPlayer implements RemoteControl{
	rc = new RemoteControl() {

	@Override
	public void turnOn() {
		System.out.println("DVD를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("DVD를 끕니다.");s
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
		
	}

}

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc=new RemoteControl(){//익명의 구현객체
		
			
		}
	}

}
