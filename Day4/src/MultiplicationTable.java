//2. Print multiplication table of a number
//o Input: Integer n
//o Output: Table from n × 1 to n × 10

import java.util.*;

public class MultiplicationTable {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printTable(n);
    }
}
