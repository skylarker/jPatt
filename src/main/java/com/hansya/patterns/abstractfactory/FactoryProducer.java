package com.hansya.patterns.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(Factory factory) {
		if (factory == null) {
			return null;
		}
		switch (factory) {
		case SHAPE:
			return new ShapeFactory();
		case COLOR:
			return new ColorFactory();
		}
		return null;
	}
}
