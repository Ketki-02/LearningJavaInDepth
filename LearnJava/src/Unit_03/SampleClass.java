package Unit_03;
import java.util.InputMismatchException;

    //if there is an exception in try blocks but there is 
	//no appropriate catch block to catch that exception still finally would run
	//if there is no exception still finally would always run
    //if there is  exception still finally would always run	
	//finally will always run

public class SampleClass {
    
	public static void main(String[] args) {
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
		finally {  
		System.out.println("Done");
		}

	}

}