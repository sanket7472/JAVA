package strings;

public class ToLowerCase {

	public static void main(String[] args) {
		
		String s = "SaNKET";
		System.out.println(toLowerCase(s));
	}
	public static String toLowerCase(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='A'&& ch<='Z') {
				ans += (char)(ch+32);
			}else {
				ans += ch;
			}
		}
		return ans;
	}
}
