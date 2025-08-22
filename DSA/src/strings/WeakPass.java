package strings;

import java.util.Arrays;

public class WeakPass {

	public static void main(String[] args) {
	
		String[] n = {"bikeCoDE","teaMakemehappy","abracaDabra","passWord","blackcoffeeIstheBest"};
		String[] m = {"coffee","coding","happy"};
		System.out.println(Arrays.toString(checkPass(n, m)));
	}
	public static String[] checkPass(String[] ar, String[] comm) {
		String[] ans= new String[ar.length];
		for (int i = 0; i < ar.length; i++) {
			boolean pass = true;
			int len = ar[i].length();
			if (len<6) {
				ans[i]=" Weak ";
				pass = false;
				
				
			}else {
				int low=0,upp=0,digit=0;
				for (int j=0; j < len; j++) {
					char ch = ar[i].charAt(j);
					if (ch>='A'&& ch<='Z') {
						upp++;
					}else if (ch>='a'&& ch<='z') {
						low++;
					}else if (ch>='0'&& ch<='9') {
						digit++;
					} 
				}
				if (!(low!=len && upp!=len && digit!=len)) {
					System.out.print(pass);
					ans[i]="Weak";
					pass = false;
				}else {
					for (int j = 0; j < comm.length; j++) {
						if (ar[i].contains(comm[j])) {
							ans[i]="Weak";
							pass = false;
							break;
						}
					}
				}
			}
			if (pass) {
				ans[i]="Strong";
			}
		}
		return ans;
	}
}
