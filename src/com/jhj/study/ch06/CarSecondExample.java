package com.jhj.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		CarSecond carSecond = new CarSecond();
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("green", 2000);

		System.out.println(carSecond.color + ", " + carSecond.cc);
		System.out.println(carSecond2.color + ", " + carSecond2.cc);
		System.out.println(carSecond3.color + ", " + carSecond3.cc);
	}

}
