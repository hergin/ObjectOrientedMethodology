package slide47;

import java.util.ArrayList;
import java.util.List;

interface Shape {
}

class Circle implements Shape {
	int radius;

	public Circle(int radiusFromOutside) {
		this.radius = radiusFromOutside;
	}

}

class Square implements Shape {
	int length;

	public Square(int lengthFromOutside) {
		this.length = lengthFromOutside;
	}
}

class AreaCalculator {

	List<Shape> shapes;

	public AreaCalculator(List<Shape> shapesFromOutside) {
		this.shapes = shapesFromOutside;
	}

	public int sum() {
		int result = 0;

		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				result += (Math.PI * ((Circle) shape).radius * ((Circle) shape).radius);
			} else if (shape instanceof Square) {
				result += (((Square) shape).length * ((Square) shape).length);
			}
		}

		return result;
	}

	// VIOLATES the SRP principle
	public void output() {
		System.out.println("The sum of the areas are " + sum());
	}

}

public class SRPv1 {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square(5));
		shapes.add(new Circle(2));
		shapes.add(new Square(3));

		AreaCalculator calculator = new AreaCalculator(shapes);
		calculator.output();
	}
}
