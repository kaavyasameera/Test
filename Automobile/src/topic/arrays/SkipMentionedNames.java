package topic.arrays;

public class SkipMentionedNames {

	public static void main(String[] args) 
	{
		String[] fruits = {"kiwi", "manGo", "orange", "banana", "kiwi", "guava", "dragon"};
		String expectedFruit = "kiwi";
		int count = 0;
		for(String eachFruit: fruits)
		{
			if(!expectedFruit.equals(eachFruit))
				count++;
		}
		System.out.println("Total fruits count other than "+expectedFruit+" is: "+count);

	}

}
