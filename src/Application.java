
public class Application {

	public static void main(String[] args) {
		//This is a multi comment
		/* Two main types of data
		 * Primitive
		 * they are:
		 * int -an integer
		 * double - decimal places 32.89235
		 * float - precision decimal data type 45.3987
		 * long - like an int numbers can be higher - differentiate with an L
		 * short - like an int, less of number range
		 * byte - 8 bits of data
		 * char - a single character - a, A, B & with single quotes
		 * boolean - can only be two values i.e True or False
		 * 
		 * Objects
		 * String - textual data, a string of characters like a word or sentence 
		 */
		
		 //this is a single comment 
		//variable declaration - type, identifier, assignment operator, value, semicolon/ meaningful
		//variables use camel case naming convention -every name after the first name is capitalized  
		int ashasAge = 30;
		double accountBalance = 55.67;
		char middleInitial = 'H';
		boolean isHotOutside = true;
		String firstName = "Asha";
		
		//shortcut sysout +control+space
		System.out.println(ashasAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		
		//operators performs actions on operands
		// + - * / 
		
		int age = 32;
		System.out.println(age);
		
		String fistName2 = "Ibrahim"; //a space after a string can make a space in output 
		String lastName2 = "Mohamed";
		String fullName = fistName2 + " " +lastName2; //concatenation also empty quotes creates space
		System.out.println(fullName);
		
		//equality operator uses double equals to see if something is equal
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		//without assigning it to variable
		System.out.println(age == 32);
		
		//comparing identical expressions
		System.out.println(30 == 57);
	}

}
