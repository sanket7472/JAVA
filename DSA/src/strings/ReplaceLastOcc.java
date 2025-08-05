package strings;

public class ReplaceLastOcc {

	public static void main(String[] args) {
		String s = "hhiughvhi3092ihkvbkjkdiriuhd0whknkdewf";
		System.out.println(replaceLastOcc(s, 'h', '@'));
	}
	public static String replaceLastOcc(String s, char old, char newChar) {
		String ans = "";
		boolean flag = true;
		for (int i = s.length()-1; i > 0; i--) {
				char ch = s.charAt(i);
			if (flag && ch==old) {
				ans+=newChar;
				flag = false;
			}else {
				ans += ch;
			}
		}
		return ReverseStr.reverseStr(ans);
	}
}
