package com.jhj.study.test.second;

public interface RemoteControl {
	public int max_volume = 10;
	public int min_volume = 0;
	
	
	abstract void turnOn();
	
	abstract void turnOff();
	
	abstract void setvolume(int volume);
	
	default void setmute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
