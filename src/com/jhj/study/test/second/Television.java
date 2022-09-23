package com.jhj.study.test.second;

public class Television implements RemoteControl{
	int volume;
	
	@Override
	public void setvolume(int volume) {
		if(volume > RemoteControl.max_volume) {
			volume = RemoteControl.max_volume;
			System.out.println("현재 TV 볼륨: " + volume);
		} else if(volume < RemoteControl.min_volume) {
			volume = RemoteControl.min_volume;
			System.out.println("현재 TV 볼륨: " + volume);
		} else {
			System.out.println("현재 TV 볼륨: " + volume);
		}
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	
}
