package slide67;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyweightV2 extends JFrame {
	private static final Color colors[] = { Color.red, Color.blue,
			Color.yellow, Color.orange, Color.black, Color.white };
	private static final int WIDTH = 400, HEIGHT = 400,
			NUMBER_OF_CIRCLES = 10000;

	public FlyweightV2() {
		Container contentPane = getContentPane();

		JButton button = new JButton("Draw Circle");
		final JPanel panel = new JPanel();

		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				long start = System.nanoTime();

				Graphics g = panel.getGraphics();
				for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
					Circle circle = CircleFactory.getCircle(getRandomColor());
					circle.draw(g, getRandomX(), getRandomY(), getRandomR());
					// Since we have 6 different colors, we have 6 objects
					// created.
				}

				System.out.println("Total time: " + (System.nanoTime() - start)
						/ 1000000.0 + " ms");

				System.out.println("Objects created: "
						+ CircleFactory.getCircleCount());
			}
		});
	}

	public static void main(String[] args) {
		FlyweightV2 test = new FlyweightV2();
	}

	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	private int getRandomR() {
		return (int) (Math.random() * (HEIGHT / 10));
	}

	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
}

class CircleFactory {
	private static final HashMap circleByColor = new HashMap();

	public static Circle getCircle(Color color) {
		Circle circle = (Circle) circleByColor.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleByColor.put(color, circle);
			System.out.println("Creating " + color + " circle");
		}
		return circle;
	}

	public static int getCircleCount() {
		return circleByColor.size();
	}
}

class Circle {
	private Color color;

	public Circle(Color color) {
		this.color = color;
	}

	public void draw(Graphics g, int x, int y, int r) {
		g.setColor(color);
		g.drawOval(x, y, r, r);
	}
}