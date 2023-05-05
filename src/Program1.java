import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int num1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number(dividend):");
		num = scan.nextInt();
		
		System.out.print("Enter second number(divisor):");  //if you enter divisor 0 it's throws exception
		num1 = scan.nextInt();
		
		int num2 = num/num1;      //After exception you code is terminated from line no. 18
		System.out.println(num2);  //You need to handle this so your next line of this code is executed properly.  see program2
		
		
		String a;
		System.out.print("Enter string:");
		a=scan.next();
		System.out.println(a);
		
		
	}

}

/*What is an exception?
An Exception is an unwanted event that interrupts the normal flow of the program. When an exception occurs program execution gets terminated. 
In such cases we get a system generated error message.
/*Why we handle the exceptions?
Exception handling ensures that the flow of the program doesn’t break when an exception occurs. 
For example, if a program has bunch of statements and an exception occurs mid way after executing certain statements then the statements, that occur after the statement that caused the exception will not execute and the program will terminate abruptly. 
By handling we make sure that all the statements execute and the flow of execution of program doesn’t break. */
