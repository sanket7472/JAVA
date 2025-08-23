package strings;

public class DnaRna {

	public static void main(String[] args) {
		String s = "000001001011101010010010110011";
		dnaRna(s);
	}
	public static void dnaRna(String s) {
		if (s.length()%3==0) {
			String first = s.substring(0,3);
			String ans = "";
			if (first.equals("000")||first.equals("111")) {
				boolean dna = false;
				if (first.equals("111")) {
					System.out.println("The String is RNA");
				}else {
					dna=true;
					System.out.println("The String is DNA");
				}
				for (int i = 3; i < s.length(); i+=3) {
					String sub = s.substring(i,i+3);
					if (sub.equals("001")) {
						ans+="C";
					}else if (sub.equals("010")) {
						ans+="G";
					}else if (sub.equals("011")) {
						ans+="A";
					}else if (sub.equals("101")) {
						ans+="T";
					}else if (sub.equals("110")) {
						if (dna) {
							ans+="T";
						}else {
							ans+="U";
						}
					}
				}
				System.out.println("The Coded String is : "+ans);
			}
			else {
				System.out.println("Invalid Input ");
			}
			
		}else {
			System.out.println("Invalid Input");
		}
	}
}
