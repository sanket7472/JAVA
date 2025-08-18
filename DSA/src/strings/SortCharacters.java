package strings;

public class SortCharacters {

	public static void main(String[] args) {
		String s = "sanket";
		System.out.println(sort(s));
	}
	public static String sort(String s) {
		byte [] ans = s.getBytes();
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length-i-1; j++) {
				if (ans[j]>ans[j+1]) {
					byte temp = ans[j];
					ans[j]=ans[j+1];
					ans[j+1]=temp;
				}       
			}
		}
		return new String(ans);
	}
}
