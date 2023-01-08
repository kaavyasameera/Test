package topic.arrays;

public class ArrayBasicsWithSingleDimention {

	public static void main(String[] args) 
	{
		String allCustomersFor2022Year[] = {"Kevin", "Ram", "Ravi", "Arvind", "Hema", "Mani"};
		String[] allCustomers = new String[3];
		allCustomers[0] = "Jean";
		allCustomers[2] = "John";
		allCustomers[1] = "William";
	    System.out.println(allCustomers[6]);
		System.out.println(allCustomersFor2022Year.length);
		System.out.println("Before updation: "+allCustomersFor2022Year[4]);
		allCustomersFor2022Year[4] = "Hari";
		System.out.println("After updation: "+allCustomersFor2022Year[4]);
		
		for(String eachCustomer: allCustomers)
		
			System.out.println(eachCustomer);
		

	}

}
