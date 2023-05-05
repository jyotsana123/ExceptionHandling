
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int num = 11/0;
		System.out.println("I am in try block: "+num);
		}
		finally {
		int num1 = 5/2;
		System.out.println("I am in finally block: "+num1);
		}
		int num2 = 10/2;
		System.out.println("I am outside the try and finally: "+num2);
	}

}

/*1. If exception in try block, then only finally block is get executed.
2. An exception in the finally block, behaves exactly like any other exception. */
//if exception in try block(excution stop at execption line immediatly), then execution comes to the finnaly block it executes the finally block only.
//if there is also execption in finally block, it behaves same as other exceptions, next line is not going to execute and execution stop only at exception line

/*if exception in try and finally both -> your finally block gets executed and exception showing of finally block
if exception in try only -> your finally block gets executed and after that  exception showing of try block */