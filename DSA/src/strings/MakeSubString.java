package strings;

public class MakeSubString {

	public static void main(String[] args) {
		String s = "hhiughvhi3092ihkvbkjkdiriuhd0whknkdewf";
		System.out.println(subString(s, 15, 10));
	}
	public static String subString(String s, int start, int end) {
		
		if (start<end && end<s.length()) {
			
			String ans = "";
			for (int i = start; i < end; i++) {
				ans+=s.charAt(i);
			}
			return ans;
		}
		
		return s;
	}
}
