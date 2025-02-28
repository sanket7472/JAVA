class MethodWithReturnString  {
	public static void main(String[] args) {
		String fullName = fullName("Sanket","Tamnar");
		System.out.print(fullName);
	}
	public static String fullName(String fname, String lname)
	{
		return (fname + " " + lname);
	}
}