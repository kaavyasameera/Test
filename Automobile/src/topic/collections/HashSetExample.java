package topic.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet<Object> al = new HashSet<Object>();
		
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
