package topic.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Ram", 325);
		hm.put("Ravi", 325);
		hm.put("Kevin", 325);
		hm.put("Jean", 325);
		hm.put("William", 325);
		hm.put("Thomas", 375);
		System.out.println(hm);
        System.out.println("Reading value based on key: "+hm.get("Ram"));
	}
}
