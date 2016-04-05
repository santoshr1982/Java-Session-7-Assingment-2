package Com.Parse.Int;
//This program has been written to handle number format exception.
public class ParseIntException {

	public static void main(String[] args) {
		
	try																							//Try block to hold exception.
	{
		int num1 = 1;
		System.out.println(num1);
		int num = Integer.parseInt ("XYZ");														//Declaring an int variable and trying to parse a string in to it.
		System.out.println(num);																//Trying to print the variable value.
	}catch(NumberFormatException e)																//Catching the error with number format exception. 
	{
		System.out.println("The value parsed to the variable num is not of integer type.");		//Printing the error.
	}
	
	}
}
