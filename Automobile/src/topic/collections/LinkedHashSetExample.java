package topic.collections;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> al = new LinkedHashSet<Object>();
		// person details
				
				al.add("Kevin");
				al.add(32);
				al.add(32);
				al.add("line 10, vij");
				al.add(32);
				al.add(1234567892);
				al.add(true);
				
				System.out.println(al);
	}
}
