package com.jhj.study.test.second;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl television = new Television();
		
		television.turnOn();
		television.setmute(true);
		television.setmute(false);
//		television.setvolume(100);
		television.setvolume(0);
		RemoteControl.changeBattery();
		television.turnOff();

	}

}
