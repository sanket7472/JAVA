package OOP;

public class Form1 

{
	// this code is written to explain constructor Chaining
	// here one constructor is call another using this() call statement
	
	String name; 
	long phno;   
	long tel;    
	char gen;    
	String blood;
	String email;
	String dob;  

	Form1()
	{
		System.out.println(" ----|  Constructor 1  |----");
	}
	
	Form1(String name, long phno, char gen, String dob)
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		System.out.println(" ----|  Constructor 2  |----");
	}
	Form1(String name, long phno, char gen, String dob, long tel)
	{
		// this() is a contructor calling statements 
		// this() statement must be written in first line of constructor block
		this(name,phno,gen,dob);
		this.tel = tel;
		System.out.println(" ----|  Constructor 3  |----");
	}
		Form1(String name, long phno, char gen, String dob,long tel, String blood)
	{
		this(name,phno,gen,dob,tel);
		this.blood = blood;
		System.out.println(" ----|  Constructor 4  |----");
	}
		Form1(String name, long phno, char gen, String dob,long tel, String blood, String email)
	{
		this(name,phno,gen,dob,tel,blood);
		this.email = email;
		System.out.println(" ----|  Constructor 5  |----");
	}

	public void displayInfo()
	{
		System.out.println("Name : "+ name);
		System.out.println("Phone no. : "+ phno);
		System.out.println("Gender : "+ gen);
		System.out.println("DOB : "+ dob );
		System.out.println("Tel : "+ tel );
		System.out.println("Blood Group : "+ blood );
		System.out.println("Email : "+ email );
	}
}


