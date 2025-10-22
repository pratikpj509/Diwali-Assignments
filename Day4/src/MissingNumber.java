
//Coding Challenges
//3. You are given an array of size n that contains distinct numbers from 0 to n. Your
//task is to find the one number that is missing from the array

import java.util.*;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array (excluding missing number): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing number is: " + findMissingNumber(arr, size));
    }
}
