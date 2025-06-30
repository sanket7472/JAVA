package exception;

public class ObjPropaExc {

	public static void main(String[] args) {
		
		// Exception Object propagation is a process 
		// of moment of exceptoin object ref from called methode (division)
		// to the calling method (main)
		// when an exception not handled in the called (division) method 
		// then the exception obj ref is propagated towards the calling method 
		// if the exception is handled in calling method then execute successfully.
		// otherwise gives exception at run time.
		try {
			division(10,0);
		}catch (ArithmeticException e) {
			
			System.out.println("Cant divide by zero");
		}
		
	}

	public static void division(int i, int j) {
		
		System.out.println(i/j);
		
	}
}/*
in this code there is a exception: 
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Exception/exception.ObjPropaExc.division(ObjPropaExc.java:12)
at Exception/exception.ObjPropaExc.main(ObjPropaExc.java:7)
*/