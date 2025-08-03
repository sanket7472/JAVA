package strings;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String s = "I Love my country";
		System.out.println(Arrays.toString(s.toCharArray()));// built in method
		System.out.println(Arrays.toString(stringToCharArr(s)));// clone method
		
	}
	public static char[] stringToCharArr(String s) {
		char [] ch = new char [s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s.charAt(i);
		}
		return ch;
	}
}
