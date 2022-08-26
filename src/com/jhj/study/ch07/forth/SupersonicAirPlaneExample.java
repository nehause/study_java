package com.jhj.study.ch07.forth;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = supersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = supersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
//		상수파일 생성 후 코드
//		supersonicAirplane.takeoff();
//		supersonicAirplane.fly();
//		supersonicAirplane.flyMode = Constants.SUPERSONIC;
//		supersonicAirplane.fly();
//		supersonicAirplane.flyMode = Constants.NORMAL;
//		supersonicAirplane.fly();
//		supersonicAirplane.land();

	}

}
