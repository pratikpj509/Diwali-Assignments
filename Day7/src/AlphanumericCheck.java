import java.util.Scanner;

	public class AlphanumericCheck {
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        if (input.matches("[A-Za-z0-9]+")) {
	            System.out.println("The string contains only alphanumeric characters.");
	        } else {
	            System.out.println("The string contains non-alphanumeric characters.");
	        }
	    }
	

}
