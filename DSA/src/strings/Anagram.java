package strings;

public class Anagram {
	
	/*
	 * very basic approch to check for anagram srtings
	 * Check length: Ensure both strings have the same length. If not, they cannot be anagrams.
		Sort and compare: Sort the characters of both strings alphabetically. 
			If the sorted strings are identical, then the original strings are anagrams.
	 * */
	public static void main(String[] args) {
		
		String s1 = "INTEGRAL";
		String s2 = "TRIANGLE";
		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s1,String s2) {
		if (s1.length()==s2.length()) {
			s1 = sort(s1);
			s2 = sort(s2);
			
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i)!=s2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static String sort(String s) {
		
		char [] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length-i-1; j++) {
				
				if (ch[j]>ch[j+1]) {
					char temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		return new String(ch);
	}
}
