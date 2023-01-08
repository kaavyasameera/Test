package toipc.polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) 
	{
		Overriding ride = new Overriding(); // both child & parent will have access to objectReferenceVariable. 
		Overloading load = new Overriding(); // only parent will have access to objectReferenceVariable, 
		//but if we have override method then child class method will get priority.
	//	Overriding ride2 = (Overriding)new Overloading(); // 
		ride.emi();
		load.emi();
	//	System.out.println(ride2.emiCalculation(250000, (byte)8, 852652));
		
		

	}

}
