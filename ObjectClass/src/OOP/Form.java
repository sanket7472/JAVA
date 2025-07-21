package OOP;

public class Form 
{
	// this code is written to explain constructor Overloading 
	
	String name; 
	long phno;   
	long tel;    
	char gen;    
	String blood;
	String email;
	String dob;  

	Form()
	{
		System.out.println(" ----|  Constructor 1  |----");
	}
	
	Form(String name, long phno, char gen, String dob)// only mandetory fields
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		System.out.println(" ----|  Constructor 2  |----");
	}
	Form(String name, long phno, char gen, String dob, long tel)
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		this.tel = tel;
		System.out.println(" ----|  Constructor 3  |----");
	}
		Form(String name, long phno, char gen, String dob, String blood)
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		this.blood = blood;
		System.out.println(" ----|  Constructor 4  |----");
	}
/*		Form(String name, long phno, char gen, String dob, String blood, String email)
			{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		this.email = email;
		this.blood = blood;
		System.out.println(" ----|  Constructor 5  |----");
			} */
		Form(String name, long phno, char gen, String dob,long tel, String blood)
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		this.tel = tel;
		this.blood = blood;
		System.out.println(" ----|  Constructor 6  |----");
	}
		Form(String name, long phno, char gen, String dob,long tel, String blood, String email)
	{
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		this.tel = tel;
		this.blood = blood;
		this.email = email;
		System.out.println(" ----|  Constructor 7  |----");
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
