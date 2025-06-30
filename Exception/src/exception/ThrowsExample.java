package exception;

public class ThrowsExample {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i<5; i++) {
			
			System.out.println("I Love India ");
			Thread.sleep(2000);
		}
		
	}
}
/* if we dont use Throws then this exception :
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type InterruptedException

	at Exception/exception.ThrowsExample.main(ThrowsExample.java:12)
*/
 