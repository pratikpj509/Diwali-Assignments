//5. Reverse a number
//o Input: Integer n
//o Output: Reversed integer

//5. Reverse a number
//o Input: Integer n
//o Output: Reversed integer

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	ReverseNumber obj=new ReverseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = obj.reverse(n);
        System.out.println("Reversed number: " + rev);
    }

     int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;      // Get last digit
            rev = rev * 10 + digit;  // Add it to reversed number
            n /= 10;                 // Remove last digit
        }
        return rev;
    }
}




//import java.util.Scanner;
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        String n = sc.next(); // take as string
//
//        String rev = reverseString(n);
//        System.out.println("Reversed number: " + rev);
//    }
//
//    static String reverseString(String n) {
//        String rev = "";
//        for (int i = n.length() - 1; i >= 0; i--) {
//            rev += n.charAt(i);
//        }
//        return rev;
//    }
//}
