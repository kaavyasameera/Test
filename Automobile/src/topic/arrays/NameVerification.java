package topic.arrays;

public class NameVerification {

	public static void main(String[] args) {
		
		String[] fruits = {"kiwi", "manGo", "orange", "banana", "guava", "dragon"};
		String expectedFruit = "Mango";
		for(String eachFruit: fruits)
		{
			if(expectedFruit.equalsIgnoreCase(eachFruit))
			{
				System.out.println(expectedFruit+" is matched");
				break;
			}
		}
		
//		for(int index=0; index<fruits.length; index++)
//		{
//			if(expectedFruit.equalsIgnoreCase(fruits[index]))
//				{
//					System.out.println(expectedFruit+" is matched");
//					break;
//				}
//		}
		
		

	}

}
