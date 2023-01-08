package topic.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionsExample 
{
	public static void main(String[] args) 
	{
		String word = "I am a automation Tester - Selenium with Java";
		word = word.toUpperCase();
		char[] allChars = word.toCharArray();
		LinkedHashMap<Character, Integer> count = new LinkedHashMap<>();
		for(char eachChar: allChars)
		{
			if(eachChar!=' ')
			{
				if(count.containsKey(eachChar))
					count.put(eachChar, count.get(eachChar)+1);
				else
					count.put(eachChar, 1);
			}
		}
		System.out.println(count);
		Set<Character> uniqueChars = count.keySet();
		HashSet<Integer> numbers = new HashSet<>();
		for(char eachChar: uniqueChars)
		{
			int num= count.get(eachChar);
			numbers.add(num);
		}
		System.out.println(numbers);
		 int bigNumber = 0;
			for(int eachNumber: numbers)
			{
				if(bigNumber>eachNumber)
					continue;
				else
					bigNumber=eachNumber;
			}
			System.out.println("Big: "+bigNumber);
		//[E, I]
			ArrayList<Character> bigCh = new ArrayList<>();
			for(char eachChar: uniqueChars)
			{
				int num= count.get(eachChar);
				if(num==bigNumber)
					bigCh.add(eachChar);
			}
			System.out.println("Most repeated chars are: "+bigCh);
	}

}
