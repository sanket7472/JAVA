package strings;

public class StrPalindrome {

	public static void main(String[] args) {
		
		String s = "nayaN";
		if (isPalindrome(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
