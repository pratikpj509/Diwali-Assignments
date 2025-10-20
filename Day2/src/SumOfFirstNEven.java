//1. Sum of first n even numbers
//o Input: Integer n
//o Output: Sum of first n even numbers

import java.util.Scanner;

public class SumOfFirstNEven {
	public static void main(String [] args) {
		SumOfFirstNEven obj=new SumOfFirstNEven();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int res=obj.sumOfEven(num);
		System.out.println("Sum Of First even numbers upto given number : "+res);
	}

	private int sumOfEven(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				sum=sum+i;
				
			}
		}
		
		return sum;
	}

}

