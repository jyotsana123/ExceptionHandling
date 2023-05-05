import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int num1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number(dividend):");
		num = scan.nextInt();
		
		System.out.print("Enter second number(divisor):");
		num1 = scan.nextInt();
		
		try
		{
		int num2 = num/num1;
		System.out.println(num2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not enter divisor as zero.");
		    System.out.println("Error Message: "+e);
		}
		
		String a;
		System.out.print("Enter string:");
		a=scan.next();
		System.out.println(a);
	}

}
