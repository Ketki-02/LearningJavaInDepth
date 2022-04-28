package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {

	public static void main(String[] args) {
		
		int     a = 10;
		float   b = 20.56f;
		char    c = 'D';
		double  d = 24.622d;
		boolean e = true;
		
		//This way these local variables can be printed.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//As static variables do not require to be called through an instance of class. SO , it can be accessed(preferably) by:>
		System.out.println( Variable.ch );
		
}

class Variable{
	static char ch = 'A';
	
    }
}