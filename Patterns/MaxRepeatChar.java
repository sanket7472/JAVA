import java.util.Scanner;
class MaxRepeatChar {
	public static void main(String[] args) {
		System.out.print(" Enter String : ");
		String 	str = new Scanner(System.in).next().toLowerCase();
		char maxRepeat = ' ';
		int max = 0, cnt = 0;
		for (char ch = 'a';ch<='z' ;ch++ ) {
					cnt = 0;

			for (int i = 0;i<str.length() ;i++ ) {
				 
				if (ch== str.charAt(i)) {
					cnt++;
				}

			}
			if (cnt > max) {
				max = cnt;
				maxRepeat = ch;
			}

		}
		System.out.println("Most repeated Character from " + str + "  is  : " + maxRepeat + " and repeated "+ max + "  times.");
	}
}