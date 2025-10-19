import java.util.Scanner;

public class Prime {
	

	private boolean primeornot(int num) {
		if(num<1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Prime obj= new Prime();
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		boolean result= obj.primeornot(num);
		if(result) {
		System.out.println(result +"-> This is Prime number");
		}else {
			System.out.println(result+"-> This is not Prime");
		}
	}


}
