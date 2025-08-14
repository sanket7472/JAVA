package strings;

public class PhoneNoValidation {

	public static void main(String[] args) {
		
		long phno = 8986489464L;
		System.out.println(isValid(phno));
	}
	public static boolean isValid(long num) {
		String s = num+"";
		if (s.length()!=10) {
			return false;
		}
		char ch = s.charAt(0);
		if (!(ch>='6'&&ch<='9')) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!(c>='0'&&c<='9')) {
				return false;
			}
		}
		return true;
	}
}
