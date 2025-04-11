package Encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s1 = new Student("Sanket", "21", 9, "Fourth Year", 'M', 123456789l,"12/12/2002");
		 	s1.getStudentDetails();
		 	// all the variables/attributes declared in class student are private 
		 	// we can't access them directly using the object referance 
		 	// we can only access them using the methods from Student class 
	}
}
