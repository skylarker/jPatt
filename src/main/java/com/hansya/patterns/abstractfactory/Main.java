package com.hansya.patterns.abstractfactory;

public class Main {

	public static void main(String... args) {
		new FactoryProducer();
		AbstractFactory shapeFactory = FactoryProducer
				.getFactory(Factory.SHAPE);
		Shape circle = shapeFactory.getShape(Shapes.CIRCLE);
		circle.draw();

		AbstractFactory colorFactory = FactoryProducer
				.getFactory(Factory.COLOR);
		Color red = colorFactory.getColor(Colors.RED);
		red.fill();
	}

}
