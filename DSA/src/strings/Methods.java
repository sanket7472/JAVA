package strings;

public class Methods {

	public static void main(String[] args) {
		
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		String s1 = new String("pneumonoultramicroscopicsilicovolcanoconiosis");
		String s2 = "Hello";
		String s3 = "Hello";
		System.out.println(s1.intern());
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1.intern()==s2);
		
	}
}
