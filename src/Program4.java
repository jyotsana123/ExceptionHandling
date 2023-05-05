
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int num = 11/0;
		System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
		int num1 = 5/2;
		System.out.println("I am finally block: " +num1);
		}
		int num2 = 10/2;
		System.out.println(num2);
	}

}

/*1. If exception in try block, then only finally block is get executed.
2. An exception in the finally block, behaves exactly like any other exception. */
//if you handle the exception in catch block, and get exception in finally block then execution stop at finally block exection line only

/* Flow of control in try catch finally in Java:
To summarise everything we have learned so far:

-If exception occurs in try block then control immediately transfers(skipping rest of the statements in try block) to the catch block. Once catch block finished execution then finally block and after that rest of the program.
-If no exception occurs in try block, then try block gets executed completely and then control gets transferred to finally block (skipping catch blocks), after which rest of the statements after try-catch-finally are executed.  */