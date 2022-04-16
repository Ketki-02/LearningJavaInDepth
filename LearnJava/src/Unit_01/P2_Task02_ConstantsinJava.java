package Unit_01;

public class P2_Task02_ConstantsinJava {
	
	//final double pi = 3.14;We can't access the non-static members in the static function
	static final int x = 5;

	public static void main(String[] args) {
		
    final double pi = 3.14;
    System.out.println(pi);
    System.out.println(x);     
	}

}
