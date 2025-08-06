package strings;

public class ReplaceOccarance {

	public static void main(String[] args) {
		String s = "hhiughvhi3092ihkvbkjkdiriuhd0whknkdewf";
		System.out.println(replace(s, 'k', '@'));
	}
	public static String replace(String s , char old , char newChar) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch==old) {
				ans+= newChar;
			}else {
				ans+=ch;
			}
		}
		return ans;
	}
}
