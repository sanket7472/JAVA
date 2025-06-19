package objectClassMethods;

public class StudentDriver {

	public static void main(String[] args) {
		

		StudentInfo s1 = new StudentInfo("Raju", "FC Collage", 1234, "BE", "IT");
		StudentInfo s2 = new StudentInfo("Raju", "FC Collage", 1234, "BE", "IT");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("-----------------");
		
		System.out.println(s1);
		System.out.println(s1.toString());

	}
}
