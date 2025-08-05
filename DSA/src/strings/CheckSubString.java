package strings;

public class CheckSubString {
		public static void main(String[] args) {
			
			String str = "malayalam";
			System.out.println(containsOf(str, "layal"));
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
		
		
	}

