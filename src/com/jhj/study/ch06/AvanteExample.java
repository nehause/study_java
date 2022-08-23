package com.jhj.study.ch06;

public class AvanteExample {

	public static void main(String[] args) {
		//객체 생성
		Avante avante1 = new Avante();
		Avante avante2 = new Avante("소나타");
		Avante avante3 = new Avante("그랜저", 4000);
		Avante avante4 = new Avante("소나타", 3500, "검정색");
		//변수 출력
		System.out.println("자동차의 이름은 " + avante1.name + ", cc는 " + avante1.cc + ", 색깔은 " + avante1.color + "이다.");
		System.out.println("자동차의 이름은 " + avante2.name + ", cc는 " + avante2.cc + ", 색깔은 " + avante2.color + "이다.");
		System.out.println("자동차의 이름은 " + avante3.name + ", cc는 " + avante3.cc + ", 색깔은 " + avante3.color + "이다.");
		System.out.println("자동차의 이름은 " + avante4.name + ", cc는 " + avante4.cc + ", 색깔은 " + avante4.color + "이다.");
	}

}
