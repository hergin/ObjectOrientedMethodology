package slide47;

import java.util.ArrayList;
import java.util.List;

class AreaCalculator2 {

	List<Shape> shapes;

	public AreaCalculator2(List<Shape> shapesFromOutside) {
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

	public int output() {
		return sum();
	}

}

class SumCalculatorOutputter {

	AreaCalculator2 calculator;

	public SumCalculatorOutputter(AreaCalculator2 calculatorFromOutside) {
		this.calculator = calculatorFromOutside;
	}

	public void inEnglish() {
		System.out.println("The sum of the areas are " + calculator.sum());
	}

	public void inTurkish() {
		System.out.println("Alanlar toplami " + calculator.sum());
	}

}

public class SRPv2 {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square(5));
		shapes.add(new Circle(2));
		shapes.add(new Square(3));

		AreaCalculator2 calculator = new AreaCalculator2(shapes);

		SumCalculatorOutputter outputter = new SumCalculatorOutputter(
				calculator);

		outputter.inEnglish();
		outputter.inTurkish();

	}
}
