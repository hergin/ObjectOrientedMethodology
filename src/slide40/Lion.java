package slide40;

class Paw {

	String whichPaw;

	public Paw(String paw) {
		whichPaw = paw;
	}

	public void move() {
		System.out.println(whichPaw + " paw moved!");
	}
}

public class Lion {

	Paw frontLeft;
	Paw frontRight;
	Paw bottomLeft;
	Paw bottomRight;

	public Lion() {
		frontLeft = new Paw("frontLeft");
		frontRight = new Paw("frontRight");
		bottomLeft = new Paw("bottomLeft");
		bottomRight = new Paw("bottomRight");
	}

	private void movePaw(Paw paw) {
		paw.move();
	}

	public void walk() {
		movePaw(frontLeft);
		movePaw(frontRight);
		movePaw(bottomLeft);
		movePaw(bottomRight);
	}

}

class Main {
	public static void main(String[] args) {
		Lion theKing = new Lion();
		theKing.walk();
	}
}
