package com.company;

public class Main {

	public static void main(String[] args) {
		var s = getValue(10);
		System.out.println(s);
	}

	public static String getValue(Integer a) {
		return String.format("Java %d", a);
	}
}
