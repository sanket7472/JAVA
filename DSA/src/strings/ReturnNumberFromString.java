package strings;

public class ReturnNumberFromString {

	public static void main(String[] args) {
	
		String s = "g265yt7ugh3ty834y8h4ruvfbvuy*&&8";
		System.out.println(returnNumber(s));
	}
	
	public static long returnNumber(String s) {
		String temp="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0'&&ch<='9') {
				temp += ch;
			}
		}
		
		return Long.parseLong(temp);
	}
}
