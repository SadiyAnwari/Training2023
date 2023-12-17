
public class Divisibleby4 {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Fibonacci number divisible by 4:");
		int fib = getFibonacciDivisibleByFour(n);
		System.out.println(fib);
	}

	public static int getFibonacciDivisibleByFour(int n) {
		int a = 0;
		int b = 1;

		while (true) {
			int sum = a + b;
			if (sum % 4 == 0)
				return sum;
			a = b;
			b = sum;
		}
	}

}
