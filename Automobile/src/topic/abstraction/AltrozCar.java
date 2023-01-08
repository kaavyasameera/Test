package topic.abstraction;

public class AltrozCar implements Car {

	@Override
	public void seatCount() {
		System.out.println(7);
		
	}

	@Override
	public void carColor() {
		System.out.println("Red");
		
	}

	@Override
	public void airBagsCount() {
		System.out.println(1);
		
	}
	
	public static void main(String[] args) {
		AltrozCar altroz = new AltrozCar();
		altroz.seatCount();
		altroz.carColor();
		altroz.airBagsCount();
		
	}

}
