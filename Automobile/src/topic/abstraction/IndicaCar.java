package topic.abstraction;

public class IndicaCar implements Car 
{

	@Override
	public void seatCount() {
		System.out.println(4);
		
	}
	
	public static void main(String[] args) {
		IndicaCar indica = new IndicaCar();
		indica.seatCount();
		indica.carColor();
		indica.airBagsCount();
		
	}

	@Override
	public void carColor() {
		System.out.println("Blue");
		
	}

	@Override
	public void airBagsCount() {
		System.out.println(4);
		
	}
	

}
