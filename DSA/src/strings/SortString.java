package strings;

//import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String s = "sanket";
		System.out.println(sort(s));
	}

	public static String sort(String s) {
		byte[] ch = s.getBytes();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length-i-1; j++) {
				if (ch[j]>ch[j+1]) {
					byte temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(ch));
		return new String(ch);
	}
}
