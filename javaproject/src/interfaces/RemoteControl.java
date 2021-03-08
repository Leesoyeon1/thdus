package interfaces;

public interface RemoteControl {
	static final int MAX_VOLUME = 10;// 메모리에 maxvolume값을 10으로 가질수 있음 상수<-> 변수
	static final int MIN_VOLUME = 0;// 상수 <-> 변수
	
	void turnOn();//추상메소드(구현구분이 없음)
	void turnOff();
	void setVolume(int volume);
}
