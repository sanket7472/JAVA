package strings;

public class ReverseStr {

	public static void main(String[] args) {
		
		String s = "sanket";
		System.out.println(reverseStr(s));
		
	}
	public static String reverseStr(String s) {
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}
}
