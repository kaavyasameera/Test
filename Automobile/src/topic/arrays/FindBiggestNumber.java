package topic.arrays;

public class FindBiggestNumber {

	public static void main(String[] args) 
	{
		int[] numbers = {15, 205, 895, 5251, 1152, 687, 56, 56};
	 int bigNumber = 0;
		for(int eachNumber: numbers)
		{
			if(bigNumber>eachNumber)
				continue;
			else
				bigNumber=eachNumber;
		}
		
		System.out.println("Biggest number is: "+bigNumber);
	}

}
