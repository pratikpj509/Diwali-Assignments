import java.util.Scanner;

public class Fact {

    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
