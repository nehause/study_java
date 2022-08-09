package com.jhj.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		// 두 int 타입 정수를 정의하고
		// 어떤 사분면에 해당되는지 출력하는 프로그램을 작성하시오
		
		int x = 1;
		int y = 0;
		
		if(x > 0 && y > 0){
			System.out.println("("+ x +", "+y+") 는 제1사분면 입니다.");
		} else if(x < 0 && y > 0){
			System.out.println("("+ x +", "+y+") 는 제2사분면 입니다.");
		} else if(x < 0 && y < 0){
			System.out.println("("+ x +", "+y+") 는 제3사분면 입니다.");
		} else if(x > 0 && y < 0){
			System.out.println("("+ x +", "+y+") 는 제4사분면 입니다.");
		} else if(x == 0 && y != 0){
			System.out.println("("+ x +", "+y+") 는 X축 위에 있습니다.");
		} else if(x != 0 && y == 0){
			System.out.println("("+ x +", "+y+") 는 Y축 위에 입습니다.");
		} else {
			// x == 0, y == 0
			System.out.println(" 이 좌표는 원점에 있습니다.");
		}

	}

}
