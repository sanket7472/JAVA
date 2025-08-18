package strings;

public class FirstAndLastOccIdx {

	public static void main(String[] args) {
		String s = "nayan";
		firstAndLastOcc(s, 'y');
	}
	public static void firstAndLastOcc(String s, char n) {
		int lastIdx=-1,firstIdx=-1;
		boolean first=true,last=true;
		for (int i = 0; i < (s.length()/2)+1; i++) {
			if (s.charAt(i)==n && first) {
				firstIdx = i;
				first = false;
			}
			if (s.charAt(s.length()-1-i)==n&& last) {
				lastIdx = s.length()-1-i;
				last = false;
			}
			if (!(first && last)) {
				break;
			}
		}
		
		System.out.println("The First Occ of "+n+" is at "+firstIdx+" index");
		System.out.println("The last Occ of "+n+" is at "+lastIdx+" index");
	}
}
