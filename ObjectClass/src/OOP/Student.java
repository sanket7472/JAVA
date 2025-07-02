class Student 
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;

	//no argument constructor
	Student(){
		System.out.println(" From No argumented constructor ");
	}
	// parameterized constructor
	Student(String name,int age, String coll, String degree, int roll){
		this.name = name;
		this.age = age;
		this.coll = coll;
		this.degree = degree;
		this.roll = roll;
		System.out.println(" From argumented constructor ");
	}

	public void displayStudent()
	{
		System.out.println(" Name : "+ name);
		System.out.println(" Age : "+ age);
		System.out.println(" College : "+ coll);
		System.out.println(" Degree : "+ degree);
		System.out.println(" Roll no. : "+ roll);
	}


}
