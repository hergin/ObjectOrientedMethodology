package slide49;

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

		for (Shape shape : shapes) {
			result += shape.computeArea();
		}

		return result;
	}

	public int output() {
		return sum();
	}

}

class VolumeCalculator extends AreaCalculator3 {

	public VolumeCalculator(List<Shape> shapesFromOutside) {
		super(shapesFromOutside);
	}

	@Override
	public int sum() {
		return super.sum() * 10;
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

public class LSPv1 {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square(5));
		shapes.add(new Circle(2));
		shapes.add(new Square(3));

		AreaCalculator3 calculator = new AreaCalculator3(shapes);
		VolumeCalculator volCalc = new VolumeCalculator(shapes);

		// we can put a VolumeCalculator wherever an AreaCalculator is requested
		// LSP principle
		SumCalculatorOutputter outputter = new SumCalculatorOutputter(volCalc);

		outputter.inEnglish();
		outputter.inTurkish();

	}
}
