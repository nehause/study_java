package com.jhj.study.ch13.first;

public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	public void out () {
		System.out.println("output");
	}
}
