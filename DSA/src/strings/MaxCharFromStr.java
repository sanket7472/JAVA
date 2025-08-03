package strings;

public class MaxCharFromStr {

	public static void main(String[] args) {
		
		String s= "sanket";
		System.out.println(maxChar(s));
	}

	public static  char maxChar(String s) {
		char max = Character.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>max) {
				max=ch;
			}
		}
		return max;
	}
}
