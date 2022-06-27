
public class Application {

	public static void main(String[] args) {
		//this is a comment
		/*
		 * Primitive:
		 * int - an integer
		 * double - decimal places
		 * float - precision decimal data type
		 * long - like an int, numbers can be higher
		 * short - like an int, less of a number range
		 * byte - 8 bits of data
		 * char - a single character a B A %
		 * boolean - true or false
		 * 
		 * Objects
		 * String - is textual data, a string of characters
		 * 
		 * Operator performs actions on operands
		 * + - *
		 */
		
		//variable declaration - type, identifier, assignment operator, value, semicolon
		
		int age = 34;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		age = age + 1;
		System.out.println(age);
		
		double accountBalance = 34.67;
		char middleInitial = 'C';
		boolean isHotOutside = true;
		String firstname = "Sam";
		String lastname = "Smith";
		String fullname = firstname + " " + lastname; //concatenation
		System.out.println(fullname);
	
	}

}
