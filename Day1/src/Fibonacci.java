import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	private List<Integer> fibo(int num) {
		List<Integer> fib= new ArrayList<>();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<num;i++) {
			fib.add(a);
			c=a+b;
			a=b;
			b=c;
		}
		return fib;
	}

	public static void main(String[] args) {
		Fibonacci obj= new Fibonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Find fibonacci series upto given number : ");
		int num=sc.nextInt();
		List<Integer> result=obj.fibo(num);
		System.out.println("Fibonacci series upto given number : "+result);
	}


}
