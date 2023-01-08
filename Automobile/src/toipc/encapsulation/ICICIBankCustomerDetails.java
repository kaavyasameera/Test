package toipc.encapsulation;

public class ICICIBankCustomerDetails 
{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ICICIBankCustomerDetails(String name, long aadharNumber, String address, int mobileNumber,
			long accountNumber) 
	{
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.accountNumber = accountNumber;
	}

	private long aadharNumber; 
	private String address; 
	private int mobileNumber; 
	private long accountNumber;

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static void main(String[] args) 
	{
	

	}


}
