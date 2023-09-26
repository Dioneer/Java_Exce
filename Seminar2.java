public class Seminar2 {
	public static void main(String[] args) {
		// Triangle tr = new Triangle(2, 2, 2);
		// double area = tr.gerArea();
		// System.out.println("area = " + area);
		try {
			int r = Factorial.getFactorial(-1);
			System.out.println(r);
		} catch (FactorialException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getNumber());
		}
	}
}

class Factorial {
	public static int getFactorial(int num) throws FactorialException {
		int r = 1;
		if (num < 0)
			throw new FactorialException("n < 1", num);
		for (int i = 1; i <= num; i++) {
			r *= i;
		}
		return r;
	}
}

class TriangleException extends Exception {
	public String toString() {
		return "Error. Bad sides of triangle.";
	}
}

class Triangle {
	private double a, b, c;

	public Triangle() {
		a = b = c = 1;
	}

	public Triangle(double _a, double _b, double _c) {
		try {
			if (((_a + _b) < _c) || ((_a + _c) < _b) || ((_b + _c) < _a)) {
				throw new TriangleException();
			}
		} catch (TriangleException e) {
			System.out.println("Exception: " + e.toString());
			return;
		}
		a = _a;
		b = _b;
		c = _c;

	}

	public double gerArea(){
		double p, s;
		p = (a+b+c)/2;
		s = Math.sqrt(p*(p-a)(p-b)(p-c));
		return s;
		}

}

class FactorialException extends Exception {
	private int number;

	public int getNumber() {
		return number;
	}

	public FactorialException(String message, int num) {
		super(message);
		number = num;

	}
}