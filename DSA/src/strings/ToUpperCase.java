package strings;

public class ToUpperCase {

	public static void main(String[] args) {
		
		String s = "sanket";
		System.out.println(toUpperCase(s));
	}
	public static String toUpperCase(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='a'&& ch<='z') {
				ans += (char)(ch-32);
			}else {
				ans += ch;
			}
		}
		return ans;
	}
}
