package wrapperClass;

public class StringToPrimitive {

	// parsing
	
	public static void main(String[] args) {
		
		String s = "100";
		// here we get NumberFormatException if the Strint is of mix type 
		// i.e 11fwg51 or kln54651 or 767384bfjh etc;
		
		System.out.println("String to byte : "+ Byte.parseByte(s));
		System.out.println("String to short : "+ Short.parseShort(s));
		System.out.println("String to int : "+ Integer.parseInt(s));
		System.out.println("String to long : "+ Long.parseLong(s));
		
		System.out.println("String to float : "+ Float.parseFloat(s));
		System.out.println("String to double : "+ Double.parseDouble(s));
		System.out.println("String to boolean : "+ Boolean.parseBoolean(s));
		
		// character class does not have parse method for converting String to char 
		// string to char is converted using charAt() method 
		
		System.out.println("String's first char : "+ s.charAt(0));





		
	}
}
