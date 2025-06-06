package Encapsulation;

public class Student {

	
	private String name;
	private String age;
	private int roll;
	private String yearOfStudy;
	private char gen;
	private long phno;
	private String dob;
	
	public Student(String name, String age , int roll , String yearOfStudy, char gen, long phno, String dob) {
		this.name = name;
		this.age = age;
		this.roll = roll;
		this.yearOfStudy = yearOfStudy;
		this.gen = gen;
		this.phno = phno;
		this.dob = dob;
		
		System.out.println(" New Student Added....!");
	}
	
	// Getter and setter methods 
	 public String getName() {
		 return name;
	 }
	 public String getAge() {
		return age;
	}
	 public int getRoll() {
		return roll;
	}
	 public String getYearOfStudy() {
		return yearOfStudy;
	}
	 public char getGen() {
		return gen;
	}
	 public long getPhno() {
		return phno;
	}
	 public String getDob() {
		return dob;
	}
	 public void setPhno(String name, long phno , long newPhno) {
		this.phno = newPhno;
	}
	
	 public void getStudentDetails() {
		
		 System.out.println(" Name : "+this.getName());
		 System.out.println(" Age : "+this.getAge());
		 System.out.println(" Roll No. : "+this.getRoll());
		 System.out.println(" Year of study  : "+this.getYearOfStudy());
		 System.out.println(" Gender  : "+this.getGen());
		 System.out.println(" Phone Number  : "+this.getPhno());	
		 System.out.println(" Date Of Birth  : "+this.getDob());	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
