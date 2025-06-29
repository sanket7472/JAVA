class FormDriver 
{
	public static void main(String[] args) 
	{
		Form f1 = new Form();
		f1.displayInfo();

		Form f2 = new Form("Sam", 654321846l, 'm', "12/2/20",894656666l, "o+", "sam@gamil.com");
		f2.displayInfo();
	}
}
