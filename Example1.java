
//public class Divisibleby4example {

//public static void main(String[] args) {
import java.util.Scanner;

class FibonacciDivisbleby4 {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter the range: ");
		/*
		 * int startRangeone = 3; int endRangeone = 150; int startRangetwo=50; int
		 * endRangetwo=2600; int firstTerm = 0; int secondTerm = 1; int nextTerm; while
		 * (true) { nextTerm = firstTerm + secondTerm; if (nextTerm >= endRangeone) {
		 * System.out.println(0); break; } else if(nextTerm >= endRangetwo){
		 * System.out.println(0); break; } if (nextTerm >= startRangeone && nextTerm % 4
		 * == 0) { System.out.println(nextTerm); break; } else if(nextTerm >=
		 * startRangetwo && nextTerm % 4 == 0){ System.out.println(nextTerm); break; }
		 * firstTerm = secondTerm; secondTerm = nextTerm;
		 */
	}
}

public class Example1{
		int	Example() {
			
			int startRangeone = 3;
			int endRangeone = 150;
			int firstTerm = 0;
			int secondTerm = 1;
			int nextTerm;
			while (true) {
				nextTerm = firstTerm + secondTerm;
				if (nextTerm >= endRangeone) {
					System.out.println(0);
					break;
				}
				else if(nextTerm >= endRangeone){
	System.out.println(0);
					break;
				}
				if (nextTerm >= startRangeone && nextTerm % 4 == 0) {
					System.out.println(nextTerm);
					break;
				}
				else if(nextTerm >= startRangeone && nextTerm % 4 == 0){
					System.out.println(nextTerm);
					break;
				}
				firstTerm = secondTerm;
				secondTerm = nextTerm;

		}
			

	}

}
