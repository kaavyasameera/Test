package topic.constructor;

public class GatherCustomerDetails extends BasicCustomerDetails  
{
	String firstName; // null
	String lastName; // null
	long aadharNumber; // 0
	String address; // null
	int mobileNumber; // 0
	
	public GatherCustomerDetails()
	{
		super("Kevin Willaims");
		System.out.println("no-args constructor");
	}
	public GatherCustomerDetails(String fn, String ln, long aadhar, String address, int mobileNumber)
	{
		super("Kevin Willaims");
		//this();
		firstName = fn;
		lastName = ln;
		aadharNumber = aadhar;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	public GatherCustomerDetails(String fn, String ln, long aadhar, String address, int mobileNumber, char maritalStatus, long income)
	{ 
		super(1541l);
		firstName = fn;
		lastName = ln;
		aadharNumber = aadhar;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	public static void main(String[] args)
	{
		GatherCustomerDetails details;
		details = new GatherCustomerDetails("Kevin", "Willaims", 12154234122l, "address", 1234567899);
		System.out.println("First name: "+details.firstName);
		System.out.println("Last name: "+details.lastName);
		System.out.println("Aadhar number: "+details.aadharNumber);
		System.out.println("Address: "+details.address);
		System.out.println("Mobile Number: "+details.mobileNumber);
		System.out.println();
		details = new GatherCustomerDetails("Ram", "Setu", 14154234122l, "address test", 1234567889);
		System.out.println("First name: "+details.firstName);
		System.out.println("Last name: "+details.lastName);
		System.out.println("Aadhar number: "+details.aadharNumber);
		System.out.println("Address: "+details.address);
		System.out.println("Mobile Number: "+details.mobileNumber);

	}

}
