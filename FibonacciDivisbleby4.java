import java.util.Scanner;

public class FibonacciDivisbleby4 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
			int firstTerm = 0;
			int secondTerm = 1;
			int nextTerm;
			while(true) {
			 nextTerm = firstTerm + secondTerm;
			if(nextTerm>=secondNumber)
			{
				System.out.println("There is no numbers within range of" +firstNumber +"to" +secondNumber);
				break;
			}
			if(nextTerm>=firstNumber && nextTerm%4==0 ) {
				System.out.println(nextTerm);
			break;
				}	
	firstTerm = secondTerm;
	secondTerm = nextTerm;
			scan.close();
			}
	}
		
	}

