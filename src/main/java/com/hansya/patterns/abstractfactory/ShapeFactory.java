package com.hansya.patterns.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	protected Shape getShape(Shapes shape) {
		if (shape == null) {
			return null;
		}
		switch (shape) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		}
		return null;
	}

	@Override
	protected Color getColor(Colors color) {
		return null;
	}
}
