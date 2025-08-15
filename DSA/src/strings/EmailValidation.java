package strings;

public class EmailValidation {

	public static void main(String[] args) {
		String s = "sank.et@gmail.in";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
		if (!(s.charAt(0)>='a'&& s.charAt(0)<='z')) {
			return false;
		}
		
		}
		int i;
		for ( i= 0; i < s.length(); i++) {
			if (s.charAt(i)=='@') {
				break;
			}
		}
		String temp = "";
		for (int j = i; j < s.length(); j++) {
			temp+=s.charAt(j);
		}
		if (!(temp.equals("@gmail.com")||temp.equals("@gmail.in"))) {
			return false;
		}
		return true;
	}
}
