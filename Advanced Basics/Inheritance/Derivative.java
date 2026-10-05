import java.util.function.DoubleUnaryOperator;

public class Derivative {
	private static final double STEP = 1e-5;

	public double derivative(DoubleUnaryOperator function, double x) {
		return (function.applyAsDouble(x + STEP) - function.applyAsDouble(x - STEP)) / (2 * STEP);
	}
}