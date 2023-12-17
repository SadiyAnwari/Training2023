import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number of terms ");
	int number=scan.nextInt();
	int firstInterger=0;
	int secondInteger=1;
	
	
	for (int i=1; i<=number; i++) {
		int NextNumber= firstInterger+secondInteger;
		firstInterger=secondInteger;
		secondInteger=NextNumber;
		System.out.println(firstInterger);
	}
	scan.close();

	}

}
