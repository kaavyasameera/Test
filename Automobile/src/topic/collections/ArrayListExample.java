package topic.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>();
		
		// person details
		System.out.println(al.size()); // 0
		al.add("Kevin");
		al.add(32);
		al.add(32);
		System.out.println(al.size()); //2
		al.add("line 10, vij");
		al.add(32);
		al.add(1234567892);
		al.add(true);
		System.out.println("name: "+al.get(0)); // 5
		System.out.println("Before add: "+al.get(3)); //
		al.add(3, "Test");
		System.out.println("After add: "+al.get(3));
		
		// I want to get all customer bank balance.
		ArrayList<Double> all = new ArrayList<>();
		all.add(15425.45);
		all.add(35425.45);
		all.add(25425.45);
		all.add(35425.45);
		all.add(45425.45);
	//	all.add("Ram");
		all.add(55425.45);
		all.add(65425.45);
		all.add(75425.45);
		all.add(35425.45);
		all.add(85425.45);
		System.out.println(all);
	}

}
