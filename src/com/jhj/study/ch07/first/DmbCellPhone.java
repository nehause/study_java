package com.jhj.study.ch07.first;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	//생성자
	
	DmbCellPhone(){
		
	}
	
	void turnOnDmb(){
		System.out.println("DMB를 실행합니다.");
		
	}
	void ChangeChannelDmb(int channel) {
		System.out.println(channel + "번 채널로 변경합니다.");
	}
	void turnOffDmb(){
		System.out.println("DMB를 종료합니다.");
	}
	
}