package com.jhj.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		//명시적 생성자를 사용해여 객체를 생성하고
		
		Student student = new Student("이름", "1999-01-23");
		Student student2 = new Student("성함", "2004-05-06", 25);
		
		
		
		//모든 필드를 출력하시오

		System.out.println("student.name: " + student.name + ", student.ssn: " + student.ssn + ", student.studentNo: " + student.studentNo);
		System.out.println("student2.name: " + student2.name + ", student2.ssn: " + student2.ssn + ", student2.studentNo: " + student2.studentNo);

	}

}
