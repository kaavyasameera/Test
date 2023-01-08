package topic.exceptions;

public class RunTimeExceptions {

	public static void main(String[] args) 
	{
	int number = 58755;
	try {
		number = number/0;  
	} 
	catch (ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("array index out of range exception");
	}
	catch (NullPointerException e) 
	{
		System.out.println("occured arithmetic exception");
	}
	
	finally
	{
		System.out.println("post action");
		System.out.println("Test");
	}
	
 //   System.out.println("Test");
	}

}
