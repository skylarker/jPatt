package com.hansya.patterns.singleton;

public class Singleton {

	private Singleton() {

	}

	public Singleton get() {
		return new Singleton();
	}

	public void foo() {
		// foo foo
	}

}
