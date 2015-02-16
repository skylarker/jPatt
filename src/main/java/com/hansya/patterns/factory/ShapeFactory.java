package com.hansya.patterns.factory;

public class ShapeFactory {
	public Shape getShape(Type type) {
		if (type == null) {
			return null;
		}
		switch (type) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		}
		return null;
	}
}
