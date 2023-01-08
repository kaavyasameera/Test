package topic.abstraction;

public class CiazCar implements Car 
{

	public static void main(String[] args) {
		CiazCar ciaz = new CiazCar();
		ciaz.seatCount();
		ciaz.carColor();
		ciaz.airBagsCount();
		
	}
	public void seatCount() 
	{
		System.out.println(5);
		System.out.println("wheels count: "+wheelsCount);
	}

	
	public void carColor() {
		System.out.println("White");
		
	}

	
	public void airBagsCount() {
		System.out.println(2);
		
	}

}
