package slide45;

class MathParams {
	public static double operand;
	public static double result;
}

class MathUtil {
	public static void square() {
		MathParams.result = MathParams.operand * MathParams.operand;
	}
}

public class CouplingV2 {
	public static void main(String[] args) {
		MathParams.operand = 10;
		MathUtil.square();
		System.out.println(MathParams.result);
	}
}
