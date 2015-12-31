package slide48_2;

import java.util.ArrayList;
import java.util.List;

interface Shape {

	abstract int computeArea();

}

class Circle implements Shape {
	int radius;

	public Circle(int radiusFromOutside) {
		this.radius = radiusFromOutside;
	}

	@Override
	public int computeArea() {
		return (int) Math.PI * radius * radius;
	}

}

class Square implements Shape {
	int length;

	public Square(int lengthFromOutside) {
		this.length = lengthFromOutside;
	}

	@Override
	public int computeArea() {
		return length * length;
	}
}

class AreaCalculator3 {

	List<Shape> shapes;

	public AreaCalculator3(List<Shape> shapesFromOutside) {
		this.shapes = shapesFromOutside;
	}

	public int sum() {
		int result = 0;

		// FIXATION of the OCP principle
		for (Shape shape : shapes) {
			// if (shape instanceof Circle) {
			// result += (Math.PI * ((Circle) shape).radius * ((Circle)
			// shape).radius);
			// } else if (shape instanceof Square) {
			// result += (((Square) shape).length * ((Square) shape).length);
			// }
			result += shape.computeArea();
		}

		return result;
	}

	public int output() {
		return sum();
	}

}

class SumCalculatorOutputter {

	AreaCalculator3 calculator;

	public SumCalculatorOutputter(AreaCalculator3 calculatorFromOutside) {
		this.calculator = calculatorFromOutside;
	}

	public void inEnglish() {
		System.out.println("The sum of the areas are " + calculator.sum());
	}

	public void inTurkish() {
		System.out.println("Alanlar toplami " + calculator.sum());
	}

}

public class OCPv2 {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square(5));
		shapes.add(new Circle(2));
		shapes.add(new Square(3));

		AreaCalculator3 calculator = new AreaCalculator3(shapes);

		SumCalculatorOutputter outputter = new SumCalculatorOutputter(
				calculator);

		outputter.inEnglish();
		outputter.inTurkish();

	}
}
