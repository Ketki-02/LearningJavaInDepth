package Unit_03;

import java.util.Scanner;

public class P14_ExceptionHandlingInJava {

	public static void main(String[] args) {
		 
		ABCD obj = new ABCD();
		obj.arithmeticException();
		obj.inputMismatchException();
		obj.stackOverFlowError(4);
        obj.checkedAndUncheckedException();
	}

}


 class ABCD
{
	void arithmeticException()
	{
	 try {
			//sensitive code
			int b=0;
			int a= 100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		//Multiple catch block can be there in a program
		//In java all exception is made my other sub-exception
		//If this super class exception is written above than child class exception then there will be unreachable catch block.
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

		//Rest of the code!
		System.out.println("Done");
	}
	void inputMismatchException() {
		Scanner sr=new Scanner(System.in);
		try
		{
			int a=sr.nextInt();
			System.out.println(a);
			sr.close();
		}
		catch(Exception e) {
			System.out.println("Input Mismatch Issue!");
		}
		sr.close();
		System.out.println("Done!");
	}
	
	void stackOverFlowError(int a)
	{
		try {
		while(a>0)
		{
			a++;
			stackOverFlowError(a);
		}
		}
		
		//There is error not exception so there is no use of catch here.
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	
	void indexOutOfBoundExceptionPart1()
	{
		int[] myNumbers = {1,2,3};
		System.out.println(myNumbers[10]);  //it is out of index
	}
	
	void indexOutOfBoundExceptionPart2()
	{
		try {
		int[] myNumbers = {1,2,3};
		System.out.println(myNumbers[10]);  //it is out of index
		}
		
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		
		//The finally statement lets you execute code,after try...catch
		//regardless of the results
		//In future,if we know try block break.....we found resources in finally
		finally {
			System.out.println("The 'try catch' is finished ");
		}
	}
	
	void manuallyThrowAnExceptionFromYourCode(int age)
	{
		try 
		{
			if(age<18)
			{
				throw new ArithmeticException("Access denied - You must ");
				
			}
		}
		catch(Exception e) {
			
		}
	}
	
	//Lazy binding
	// it will not handle exception itself
	//they want to pass their exception
	//Sensitive code
	void useOfThrow(int age) throws Exception {        //you can write many exceptions by putting comma
		
		if(age < 18)
		{
			throw new Exception();
	    }
		else {
			System.out.println("You are allowed to enter");
		}
	}
	
	
	/*void inputMismatchException() throws Exception{
		
		Scanner sr = new Scanner(System.in);
		
		int a = sr.nextInt();
		System.out.println(a);
		sr.close();
	}*/
	
	
	void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useOfThrow(19);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}

}

@SuppressWarnings("serial")
class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}

  }

