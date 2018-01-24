package main;

public class Hello {
	public static void main(String[] args) {
		System.out.print("Hello World!");
	}

	public String createName(String firstName, String lastName) {
		String Name = firstName + " " + lastName;
		return Name;
	}
	
	public String numberLessThanNine(int value) throws Exception
	{
		// Check if the value is between 1 and 9.
		if(value < 1 || value > 9)
			throw new Exception("Value is not less than nine.");
		
		String Message = "Value is good.";
		
		return Message;
	}
}
