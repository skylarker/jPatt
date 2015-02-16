package com.hansya.patterns.factory;

public class Main {

	public Main() {
	}

	public static void main(String... args) {
		Shape circle = new ShapeFactory().getShape(Type.CIRCLE);
		circle.draw();
		Shape square = new ShapeFactory().getShape(Type.SQUARE);
		square.draw();
		Shape rectangle = new ShapeFactory().getShape(Type.RECTANGLE);
		rectangle.draw();
	}
}
