package Abstraction.ObjectClass;

public class StudentHashcode {

	String name;
	String collage;
	int roll;
	String degree;
	String stream;
	public StudentHashcode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentHashcode(String name, String collage, int roll, String degree, String stream) {
		super();
		this.name = name;
		this.collage = collage;
		this.roll = roll;
		this.degree = degree;
		this.stream = stream;
	}

	@Override
	public boolean equals(Object obj) {
	
		StudentHashcode s = (StudentHashcode) obj;
		
		if (this.name == s.name && this.collage == s.collage && this.roll == s.roll 
				&& this.degree == s.degree && this.stream == s.stream) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		/*
		 * need to add all whole value members like int , byte, short, long, chat.
		 * when we tried to add strings then need to get the hashcode of each string then add with others.
		 * */
		return roll + collage.hashCode() + name.hashCode() + degree.hashCode() + stream.hashCode();
	}
	
	
}
