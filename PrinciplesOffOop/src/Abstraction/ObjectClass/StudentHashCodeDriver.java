package Abstraction.ObjectClass;

public class StudentHashCodeDriver {

	public static void main(String[] args) {
		
		StudentHashcode s1 = new StudentHashcode("Raju ", "SVIT", 1234, "BE", "Comp ");
		StudentHashcode s2 = new StudentHashcode("Raju ", "SVIT", 1234, "BE", "Comp ");
		
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println("---------------------------");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
		
	}
}
