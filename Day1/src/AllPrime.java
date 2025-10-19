import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllPrime {

    private List<Integer> findPrime(int num) {
        List<Integer> primes = new ArrayList<>();

        for (int n = 2; n <= num; n++) {
            if (isPrime(n)) {
                primes.add(n);
            }
        }

        return primes;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        AllPrime obj = new AllPrime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Find all prime numbers up to: ");
        int num = sc.nextInt();

        List<Integer> result = obj.findPrime(num);
        System.out.println("Prime numbers up to " + num + " are: " + result);
    }
}
