package slide50;

interface TwoDshape {
	abstract int area();
}

interface SolidShape {
	abstract int volume();
}

class Square2 implements TwoDshape {

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Cube implements SolidShape {

	@Override
	public int volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class ISPv2 {

}
