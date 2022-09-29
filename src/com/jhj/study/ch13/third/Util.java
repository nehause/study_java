package com.jhj.study.ch13.third;

public class Util {
	
					//박스 객체를 리턴한다.
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
}
