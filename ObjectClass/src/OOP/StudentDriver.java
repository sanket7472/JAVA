package OOP;

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		//here the no argumented constructor will call and bind 
		s1.displayStudent();
		System.out.println("----------------------------------");
		Student s2 = new Student("Sanket",21,"SVIT College","BE",123);
		// here the argumented contructor will call and bind
		s2.displayStudent();
	}
}
