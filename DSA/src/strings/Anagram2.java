package strings;

public class Anagram2 {

	/*
	 * Checking String are anagram or not using hashing method .
	 * first check both strings are of same length if not return false.
	 * 1) first approch
	 * use byte array then try to increament on the position of character 
	 * then check in both array . compare both array have same value on same index
	 * 2) advance approch
	 * 	use only one byte array 
	 * do increament for characters of first string then decrement for second string 
	 * check all the index of the array having values zero if not return false.
	 * */
	
	public static void main(String[] args) {
		
		String s1 = "Tom Marvolo Riddle";
		String s2 = "I am Lord Voldemort";
		System.out.println(checkAnagramIgnoreCase(s1, s2));
	} 
	// first approch :--> using two arrays
	public static boolean checkAnagram(String s1,String s2) {
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		if (s1.length()==s2.length()) {
			
			
			
			for (int i = 0; i < s1.length(); i++) {
				str1[s1.charAt(i)]++;
				str2[s2.charAt(i)]++;
			}
			for (int i = 0; i < str2.length; i++) {
				if (str1[i]!=str2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	// second way :----> using single array
	public static boolean checkAnagram2(String s1,String s2) {
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		if (s1.length()==s2.length()) {
			
			int [] str = new int[128];
			
			
			for (int i = 0; i < s1.length(); i++) {
				str[s1.charAt(i)]++;
				str[s2.charAt(i)]--;
			}
			for (int i = 0; i < str.length; i++) {
				if (str[i]!=0) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}
	
	// ignore case 
	public static boolean checkAnagramIgnoreCase(String s1,String s2) {

		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		if (s1.length()==s2.length()) {
			
			int [] str = new int[128];
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			for (int i = 0; i < s1.length(); i++) {
				str[s1.charAt(i)]++;
				str[s2.charAt(i)]--;
			}
			for (int i = 0; i < str.length; i++) {
				if (str[i]!=0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
