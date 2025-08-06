package strings;

public class CheckSubString {
		public static void main(String[] args) {
			String str = "ssspss";
			System.out.println(contains(str, "sspss"));
		}
//		METHODS
		
		public static boolean containsOf(String str, String ip) {
			
			int check = 0, j = ip.length()-1,k = str.length()-1, check2 = 0;
			
			if (ip.length() <= str.length()) {
				
				for (int i = 0; i < str.length(); i++, k--) {
					// forward checking
					if ((check < ip.length()) && str.charAt(i) == ip.charAt(check)) {
						check++;
					}
					else if (check != ip.length()){
						
						check = 0;
					}
					// backword checking
					if ((check2 < ip.length()) && str.charAt(k) == ip.charAt(j)) {
						check2++;
						j--;
					}
					else if(check2 != ip.length()) {
						j = ip.length()-1;
						check2 = 0;
					}
					
					if (check == ip.length() || check2 == ip.length()) {
						return true;
					}
				}
				return false;
			}
			else {
				return false;
			}
		}
		
		public static boolean contains(String s, String t) {
			
			int check =0;
			for (int i = 0; i < s.length(); i++) {
				
				if(check<t.length() && s.charAt(i)==t.charAt(check)) {
					check++;
				//	System.out.println(check);
				}
				else {
					if (check==t.length()){
						System.out.println(check);
						return true;
					}
					else if(check>0){
						i-=check;
						check=0;
					}
				}
			}
			return false;
			
		}
		
		
	}

