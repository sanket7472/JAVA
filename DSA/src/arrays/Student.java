package arrays;

public class Student {

	String name;
	String clg;
	int id;
	int age;
	public Student(String name, String clg, int id, int age) {
		super();
		this.name = name;
		this.clg = clg;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", clg=" + clg + ", id=" + id + ", age=" + age + "]";
	}
	
	public void displayStudent() {
		
		System.out.println("Name : "+name);
		System.out.println("Collage name : "+clg);
		System.out.println("Student ID : "+id);
		System.out.println("Age : "+age);
	}
	
	
}
