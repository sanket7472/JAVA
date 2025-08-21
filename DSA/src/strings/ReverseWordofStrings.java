package strings;

public class ReverseWordofStrings {

	public static void main(String[] args) {
		String s = "India@ is my! country ";
		
		System.out.println(revWordsOfString(s));
	}
	
	public static String revWordsOfString(String s) {
		String ans = "";
		String word = "";
		for (int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i);
			if (ch!=' ') {
			word += ch;
			}
			else {
				ans += reverseWord(word)+ " ";
				word = "";
			}
		}
		return ans;
	}
	public static String reverseWord(String s) {
		String ans = "";

		if (s.charAt(s.length()-1)>='a'&&s.charAt(s.length()-1)<='z'||
				s.charAt(s.length()-1)>='A'&&s.charAt(s.length()-1)<='Z') {
		
			for (int i = s.length()-1;i>=0; i--) {
				ans += s.charAt(i);
			}
			return ans;
		}
		else {
			for (int i = s.length()-2;i>=0; i--) {
				ans += s.charAt(i);
			}
			return ans+s.charAt(s.length()-1);
			
		}
		
	}
}
