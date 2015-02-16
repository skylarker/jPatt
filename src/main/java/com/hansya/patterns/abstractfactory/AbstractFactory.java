package com.hansya.patterns.abstractfactory;

public abstract class AbstractFactory {

	protected abstract Shape getShape(Shapes shape);

	protected abstract Color getColor(Colors color);
}
