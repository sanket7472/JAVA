package strings;

import java.util.Arrays;

public class ToByteArray {

	public static void main(String[] args) {
		
		String s = "I Love India ";
		
		System.out.println(Arrays.toString(s.getBytes()));// built in method
		System.out.println(Arrays.toString(stringToByteArr(s)));//clone method
	}
	public static byte[] stringToByteArr(String s) {
		byte [] ch = new byte [s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(byte)s.charAt(i);
		}
		return ch;
	}
}
