import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String word=scan.next();
		String reverse="";
		for (int i=word.length()-1; i>=0; i--){
			reverse+=word.charAt(i);
			}
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println(" It is not a palindrome");
		}
		scan.close();
	}

}
