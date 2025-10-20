//4. Check if a number is an Armstrong number
//o Input: Integer n
//o Output: True if sum of digits raised to power equals number

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        boolean res = obj.isArmstrong(num); // Pass num to method

        if (res) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is NOT Armstrong");
        }
    }

    private boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        // Step 1: Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        // Step 2: Compute sum of each digit^digits (brute force)
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            // Calculate digit raised to the power of digits manually
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        // Step 3: Compare
        return sum == original;
    }
    
    
//    Method to check Armstrong number
//    static boolean isArmstrong(int n) {
//        int original = n;
//        int sum = 0;
//        int digits = String.valueOf(n).length(); // Count number of digits
//
//        while (n > 0) {
//            int digit = n % 10;
//            sum += Math.pow(digit, digits); // Raise digit to power of number of digits
//            n /= 10;
//        }
//
//        return sum == original; // True if Armstrong
//    }
    
}
