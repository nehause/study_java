package com.jhj.study.fifth;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// Phone 의 abstract 때문에 일반적인 new는 안된다.
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("jhj");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
	}

}
