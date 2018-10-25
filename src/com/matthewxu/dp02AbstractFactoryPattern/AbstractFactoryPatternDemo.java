package com.matthewxu.dp02AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

		Shape circle = shapeFactory.getShape("circle");
		Shape rectangle = shapeFactory.getShape("rectangle");
		Shape square = shapeFactory.getShape("square");

		circle.draw();
		rectangle.draw();
		square.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("color");

		Color red = colorFactory.getColor("red");
		Color blue = colorFactory.getColor("blue");
		Color green = colorFactory.getColor("green");

		red.fill();
		blue.fill();
		green.fill();
	}
}
