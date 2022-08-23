package com.jhj.study.ch06;

public class AruthmeticExample {

	public static void main(String[] args) {

		Aruthmetic aruthmeic = new Aruthmetic();
		
		int sum = aruthmeic.plus(5,10);
		
		
		int sub = aruthmeic.minus(12,3);
		
		
		int mul = aruthmeic.multi(2,3);
		
		
		int div = aruthmeic.divide(16,4);
		
				
		int rem = aruthmeic.remainder(7,3);
		
		
		aruthmeic.say(sum);
		aruthmeic.say(sub);
		aruthmeic.say(mul);
		aruthmeic.say(div);
		aruthmeic.say(rem);
		
		aruthmeic.StringSum("안녕하세요", " 만나서 반갑습니다.");

	}

}
