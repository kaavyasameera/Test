package cars.suzuki;

public class ErtigaCar extends SwiftCar
{

	public static void main(String[] args) 
	{
		 //highestAge(15, 12, 28);
	}
	
	public static void highestAge(int Ram, int Ravi, int Hema)
	{
		if(Ravi>Ram & Ravi>Hema)
			System.out.println("Ram age is greater");
		else if(Ram>Ravi & Ram>Hema)
			System.out.println("Ravi age is greater");
		
		else
			System.out.println("Hema age is greater");
	}
	
	public static void getSeatCount()
	{
		byte age = 30; //365-256 -128 to +127
		short days = 560;
		int hours = 5863;
		System.out.println("Before Type cast: "+age);
		age = (byte)days; // Explicit typecast.
		hours = days; // implicit Type cast / Up Tyecast
		System.out.println("After Type Cast: "+age);
		System.out.println("Implicit: "+hours);
		System.out.println(7);
	}

}
