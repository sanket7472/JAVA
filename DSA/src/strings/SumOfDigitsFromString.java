package strings;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		String s = "sf1dg2fr3sf5ds4sd6f7sf8s9sfg0";
		System.out.println(sumOfDigits(s));
	}
	public static int sumOfDigits(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0'&& ch<='9') {
				sum = sum + (ch-48);
			}
		}
		return sum;
	}
}
