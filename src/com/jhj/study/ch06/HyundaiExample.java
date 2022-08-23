package com.jhj.study.ch06;

public class HyundaiExample {

	public static void main(String[] args) {
		
		Hyundai hyundai = new Hyundai();
		
		hyundai.carModel();
				
		// 배열만 지정하고 실행클래스에서 for문을 하면
		// hyundai.model.length
		//ex)
		for(int i=0; i<hyundai.model.length; i++) {
			System.out.println(hyundai.model[i]);
		}
		
		int result = hyundai.sum(1, 2);
	}

}
