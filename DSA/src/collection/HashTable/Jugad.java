package collection.HashTable;

public class Jugad {

	public static void main(String[] args) {
		/*
		 * Java claims that the hashcode method generates
		 * the unique code for every object 
		 * but their is a bug in hashCode method of String class 
		 * hashcode method gives same hashcode for Strings "FB" and "Ea"
		 * */
		
		String s1 = "FB";
		String s2 = "Ea";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	
	}
}
