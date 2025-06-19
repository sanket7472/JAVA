package objectClassMethods;

public class StudentInfo {

	String name;
	String collage;
	int roll;
	String degree;
	String stream;
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentInfo(String name, String collage, int roll, String degree, String stream) {
		super();
		this.name = name;
		this.collage = collage;
		this.roll = roll;
		this.degree = degree;
		this.stream = stream;
	}
	
	public String toString()
	{
		return "Name : " + name +", Collage : "+collage+", Roll no. : "+roll+", Degree : "+degree+", Stream : "+stream;
	}
	
	public boolean equals(Object o )
	{
		StudentInfo s = (StudentInfo) o;
		if (this.name == s.name && this.collage == s.collage && this.roll == s.roll 
				&& this.degree == s.degree && this.stream == s.stream) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
