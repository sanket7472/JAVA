package strings;

public class StringLength {

	public static void main(String[] args) {
		
		String s = "I Love India";
		System.out.println(s.length());// built in method
		System.out.println(length(s));// clone method without built-in methods
		
	}
	public static int length(String s) {
		int len = 0;
		try {
			while (true) {
				s.charAt(len);
				len++;
			}
		} catch (StringIndexOutOfBoundsException e) {
			return len;
		}
	}
}
