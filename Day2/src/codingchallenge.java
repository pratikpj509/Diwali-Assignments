//Coding Challenges
//2. Given an integer n, reverse its digits and return the reversed number. Ignore
//leading zeros in the reversed result.

import java.util.Scanner;
public class codingchallenge {
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        System.out.println("Reversed number: " + reverseNumber(n));
	    }

	    // Method to reverse digits
	    public static int reverseNumber(int n) {
	        int rev = 0;
	        while (n != 0) {
	            int digit = n % 10;     // Get last digit
	            rev = rev * 10 + digit; // Build reversed number
	            n /= 10;                // Remove last digit
	        }
	        return rev;
	    }
	


}
