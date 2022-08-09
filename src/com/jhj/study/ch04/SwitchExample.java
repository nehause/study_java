package com.jhj.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
			case 1:
				System.out.println("정수 1 입니다.");
				break;
			case 2:
				System.out.println("정수 2 입니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수 입니다.");
				break;
		}
		
		String position ="사원";
		
		switch(position) {
			case "사원": // if(position.equal("사원")))
				System.out.println("사원님 어서오십시요.");
				break;
			case "대리":
				System.out.println("대리님 어서오십시요.");
				break;
			case "과장":
				System.out.println("과장님 어서오십시요.");
				break;
			case "차장":
				System.out.println("차장님 어서오십시요.");
				break;
			case "부장":
				System.out.println("부장님 어서오십시요.");
				break;
			case "사장":
				System.out.println("사장님 어서오십시요.");
				break;
			case "회장":
				System.out.println("회장님 어서오십시요.");
				break;
			default:
				System.out.println("외부인은 출입이 제한됩니다.");
				break;
		}
	}

}
