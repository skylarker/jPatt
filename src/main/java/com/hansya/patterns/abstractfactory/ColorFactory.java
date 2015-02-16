package com.hansya.patterns.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	protected Shape getShape(Shapes shape) {
		return null;
	}

	@Override
	protected Color getColor(Colors color) {
		if (color == null) {
			return null;
		}
		switch (color) {
		case RED:
			return new Red();
		case BLUE:
			return new Blue();
		case GREEN:
			return new Green();
		}
		return null;
	}

}
