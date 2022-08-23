package com.jhj.study.ch06;

public class Hyundai {
	String name ="현대 자동차";
	String[] model = {"아반테", "소나타", "그랜저"};
	
	public void carModel(){
		for(int i=0; i<model.length; i++){
			System.out.println(name + "의 모델 중 하나는 " + model[i] + "입니다.");
		}
	}
	
	//덧셈 함수 예시
	public int sum(int a, int b) {
		
		int sum = 0;
		
		sum = a+b;
		
		return sum;
	}
}
