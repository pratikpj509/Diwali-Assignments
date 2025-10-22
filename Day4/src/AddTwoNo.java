//1. Addition of two numbers
//o Input: a, b
//o Output: a + b

import java.util.*;
public class AddTwoNo {
	
	    public static int addNumbers(int a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println("Sum = " + addNumbers(a, b));
	    }
	


}
