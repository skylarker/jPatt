package com.hansya.patterns.abstractfactory;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Filling it in red...");
	}
}
