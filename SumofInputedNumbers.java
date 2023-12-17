import java.util.Scanner;

public class SumofInputedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first integer: ");
		int number1=scanner.nextInt();
		System.out.println("enter the Second integer: ");
		int number2=scanner.nextInt();
		int sum= number1+number2;
		System.out.println("Sum of numbers " +sum);
		scanner.close();
	}

}
