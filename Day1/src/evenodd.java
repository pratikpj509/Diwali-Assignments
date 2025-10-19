import java.util.Scanner;

public class evenodd {
	
	private boolean evenodd(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		evenodd obj= new evenodd();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		boolean res=obj.evenodd(num);
		if(res) {
			System.out.println("number is Even");
		}else {
			System.out.println("number is Odd");
		}
	}

	

}
