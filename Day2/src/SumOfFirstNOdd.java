//2. Sum of first n odd numbers
//o Input: Integer n
//o Output: Sum of first n odd numbers

import java.util.Scanner;

public class SumOfFirstNOdd {

	public static void main(String [] args) {
		SumOfFirstNOdd obj=new SumOfFirstNOdd();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int res=obj.sumOfOdd(num);
		System.out.println("Sum Of First Odd numbers upto given number : "+res);
	}

	private int sumOfOdd(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2==1) {
				sum=sum+i;
				
			}
		}
		
		return sum;
	}


}
