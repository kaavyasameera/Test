package topic.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<Object> al = new LinkedList<Object>();
		
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
		System.out.println(al.size()); // 5
		
		System.out.println(al);
		
		// I want to get all customer bank balance.
		LinkedList<Double> all = new LinkedList<>();
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
