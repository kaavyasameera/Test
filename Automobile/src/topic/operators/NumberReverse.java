package topic.operators;

public class NumberReverse {

	public static void main(String[] args) 
	{
		int number = 25123, reminder=0;
		number/=10;
		System.out.println(number%10);
		System.out.println(number);  // 2512
		number/=10;
		System.out.println(number%10);
		System.out.println(number); // 251
		number/=10;
		System.out.println(number%10);
		System.out.println(number); //25
		String reverse="";
				
		for(int n=(int)number; n!=0; n=n/10)
		{
			reminder = n%10;
			reverse = reverse+reminder;
		}
		System.out.println("Reverse of the "+number+" is: "+reverse);
		
	}

}
