package strings;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String s = "nayannayan";
		System.out.println(longestPalindrome(s));
	}
	public static String longestPalindrome(String s) {
		 s = addSpace(s);
		 
		 int i=0,j=0,k=0;
		 int max =0;
		 String longestPal = "";
		 
		 while (i<s.length()) {
			
			 if (j>0&&k<s.length()-1) {
				
				 if (s.charAt(j-1)==s.charAt(k+1)) {
					j--;
					k++;
				}else if (k-j>0) {
					
					String temp = s.substring(j,k+1).replace(" ", "");
					if (max<temp.length()) {
						
						max = temp.length();
						longestPal = temp;
					}
					i++;
					j=k=i;
				}
				else {
					i++;
					j=k=i;
				}
			}
			 else {
				 if (k-j>0) {
						
						String temp = substring(s,j,k+1);
						temp = replace(temp, " ","");
						if (max<temp.length()) {
							
							max = temp.length();
							longestPal = temp;
						}
			 }
				 i++;
				j=k=i;
		}
	 }
		 return longestPal;
	}
	public static String addSpace(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			
			ans += s.charAt(i) + " ";
		}
		return ans.trim();
	}
	public static String substring(String s,int i,int j) {
		String ans="";
		for (int k = i; k < j; k++) {
			ans+=s.charAt(k);
		}
		return ans;
	}
	public static String replace(String s,String old,String n) {
		String ans = "";
		for (int i = 0; i <s.length(); i++) {
			String ch = s.charAt(i)+"";
			if (ch.equals(old)) {
				ans+=n;
			}else {
				ans+=ch;
			}
		}
		return ans;
	}
}
