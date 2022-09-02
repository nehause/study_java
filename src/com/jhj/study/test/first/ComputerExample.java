package com.jhj.study.test.first;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 7;
		
		System.out.println("원의 반지름: " + r + "\n");
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적: "+ calculator.circleArea(r) + "\n");
		
		Computer computer = new Computer();
		
		System.out.println("원면적: "+ computer.circleArea(r) + "\n");

	}

}
