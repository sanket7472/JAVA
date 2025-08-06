package strings;

public class ReplceFirstOcc {

	public static void main(String[] args) {
		String s = "hhiughvhi3092ihkvbkjkdiriuhd0whknkdewf";
		System.out.println(replaceFirstOcc(s, 'h', '@'));
	}
	public static String replaceFirstOcc(String s, char old, char newChar) {
		String ans = "";
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
			if (flag && ch==old) {
				ans+=newChar;
				flag = false;
			}else {
				ans += ch;
			}
		}
		return ans;
	}
	public static String replaceFirstOccarance(String s,char old, char newChar) {
		int idx = firstOccIdx(s, newChar);
		if (idx>0) {
			String ans = "";
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (i==idx) {
					ans += newChar;
				}else {
					ans+=ch;
				}
			}
			return ans;
		}
		return s;
	}
	public static int firstOccIdx(String s, char ch) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
}
