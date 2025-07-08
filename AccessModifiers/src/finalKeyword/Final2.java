package finalKeyword;


public class Final2 {

	//only declare
	//static final int a; // CTE not initialized
	// we can declare and leave a static final variable 
	// but initialization is mandetory before use otherwise CTE
	
	static final int TEN_CUBE ;
	
	// initialization 
	// 1) direct

	// declare and initialize
	
		static final double PI = (22.0/7.0) ;;
		
	// 2) in static block 
	static
	{
		int pow = 1;
		for(int i=0;i<3;i++) {
			pow*=10;
		}
		TEN_CUBE = pow;
	}
	
}
