package topic.collections;

import java.util.HashMap;

public class FindingOrder {

	public static void main(String[] args) 
	{
		String s2 = "{[()]}";
		String s = "{{[()]]}";
		HashMap<Character, Character> brace = new HashMap<>();
		brace.put('}', '{');
		brace.put(']', '[');
		brace.put(')', '(');
		brace.put(')', '(');
		int allBraces = s.length();
		boolean flag = false;
		if(allBraces%2==0)
		{
			for(int index=0; index<allBraces/2; index++)
			{
				if(s.charAt(index) !=brace.get(s.charAt(allBraces-index-1)))
					flag = true;
			}
			if(flag)
				System.out.println("not in order");
			else
				System.out.println("in proper order");
		}
		else
			System.out.println("Braces are odd number, so not proper in order");
	}
}
