package strings;

public class ReplaceFirstOccOnly {

	public static void main(String[] args) {
		
		String s = "maharashtra";
		System.out.println(replaceFirstOcc(s, 'r', 't'));
	}
	public static String replaceFirstOcc(String s,char old,char n) {
		
		boolean flag = true;
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch==old && flag) {
				
				ans+=n;
				flag = false;
			}
			else {
				ans+=ch;
			}
		}
		
		return ans;
	}
}
