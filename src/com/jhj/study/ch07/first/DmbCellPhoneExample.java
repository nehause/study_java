package com.jhj.study.ch07.first;

public class DmbCellPhoneExample {
	
	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOff();
		cellPhone.powerOn();
		cellPhone.bell();
		cellPhone.sendVoice("하이");
		cellPhone.receiveVoice("바이");
		cellPhone.hangUp();
		
		System.out.println("=====================");
		
		DmbCellPhone cellPhone2 = new DmbCellPhone();
		
		cellPhone2.turnOnDmb();
		cellPhone2.ChangeChannelDmb(5);
		cellPhone2.turnOffDmb();
		
		System.out.println("=====================");
		
		cellPhone2.powerOn();
		cellPhone2.powerOff();
		cellPhone2.bell();
		cellPhone2.sendVoice("하이");
		cellPhone2.receiveVoice("바이");
		cellPhone2.hangUp();
	}
	
}
