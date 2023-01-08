package topic.collections;

import java.util.LinkedHashSet;

public class UniqueCharsFind 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String word = "Selenium with Java version 8";
		word = word.toUpperCase();
		char[] allChars = word.toCharArray();
		LinkedHashSet<Character> unique = new LinkedHashSet<>();
		for(char eachChar: allChars)
			unique.add(eachChar);
		
		System.out.println(unique);
	}
}
