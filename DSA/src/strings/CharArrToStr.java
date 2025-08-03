package strings;

public class CharArrToStr {

	public static void main(String[] args) {
		
		char [] ch = {'s','a','n','k','e','t'};
		
		String s = new String(ch);// using constructor
		System.out.println(s);
		System.out.println(charArrToString(ch));// clone
	}
	public static String charArrToString(char []ch) {
		String s="";
		for (int i = 0; i < ch.length; i++) {
			s+=ch[i];
		}
		return s;
	}
}
