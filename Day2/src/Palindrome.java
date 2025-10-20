//3. Check if a number is a palindrome
//o Input: Integer n
//o Output: True if reversed number equals original

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome obj= new Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean res= obj.isPalindrome(num);
		if(res) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("NUmber is Not Palindrome");
		}
	}

	private boolean isPalindrome(int num) {
		int n=num;
		int digit;
		int sum=0;
		while(num>0) {
			digit=num%10;
			sum=(sum*10)+digit;
			num=num/10;
					
		}
		if(n==sum) {
			return true;
		}
		return false;
	}

}
