package toipc.encapsulation;

public class CheckCustomerBalance 
{
	public static void main(String[] args) 
	{
		CheckCustomerBalance balance = new CheckCustomerBalance();
		balance.checkBalance();

	}
	public void checkBalance()
	{
		ICICIBankCustomerDetails balance = new ICICIBankCustomerDetails
				("Kevin W", 215456l, "test", 122326, 12454265266l);
		long accountNumber = balance.getAccountNumber();
		System.out.println(balance.getName()+" Account Number: "+accountNumber);
		System.out.println();
	}
	

}
