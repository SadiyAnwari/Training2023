import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the limit for prime numbers");
	int limit= scan.nextInt();
	for (int number=2; number<=limit; number++) {
		boolean isPrime=true;
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number%i==0) {
		isPrime=false;
				break;
			}
			}
			if (isPrime) {
			System.out.println(number);
			}
		
	}
	scan.close();

}
}

/* import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.print("Prime numbers up to " + limit + ": ");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
} */
