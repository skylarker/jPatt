package com.hansya.patterns.factory;

public class Main {

	public Main() {
	}

	public static void main(String... args) {
		Shape circle = new ShapeFactory().getShape(Shapes.CIRCLE);
		circle.draw();
		Shape square = new ShapeFactory().getShape(Shapes.SQUARE);
		square.draw();
		Shape rectangle = new ShapeFactory().getShape(Shapes.RECTANGLE);
		rectangle.draw();
	}
}
