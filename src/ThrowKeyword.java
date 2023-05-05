import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter age for the registration: " );
		int age = scan.nextInt();
		if(age<10)
		{
			throw new ArithmeticException("less than 10 years is not allowed to attend the show");
		}
		else
		{
			System.out.println("You can attend the show");
		}
	}

}

/* We can define our own set of conditions or rules and throw an exception explicitly using throw keyword.
In java we can create our own exception class and throw that exception using throw keyword. These exceptions are known as user-defined or custom exceptions. */