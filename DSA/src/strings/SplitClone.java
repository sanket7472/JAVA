package strings;

import java.util.Arrays;

public class SplitClone {

		public static void main(String[] args) {
			String s="sssabssssabssssabssss";
			System.out.println(Arrays.toString(split1(s, 'a')));
			
			System.out.println(Arrays.toString(s.split("ab")));
		}
		public static String[] split1(String s, char ref) {
			String temp="";
			int cnt=0,ct=0;
			
			for (int i= s.length()-1;i>0; i--) {
				if (s.charAt(i)!=ref) {
					break;
				}
				else {
					ct++;
				}
			}
			
			for (int i = 0; i < s.length()-ct; i++) {
				if (s.charAt(i)==ref) {
					cnt++;
				}
			}
			
			String []ans= new String[cnt+1];
			for (int i = 0,j=0; i < s.length()-ct; i++) {
				char ch= s.charAt(i);
				if(ch!=ref) {
					temp+=ch;
					
				}
				else {
					ans[j++]=temp;
					temp="";
				}
				
			}
			ans[ans.length-1]=temp;

			return ans;
		}
	}

