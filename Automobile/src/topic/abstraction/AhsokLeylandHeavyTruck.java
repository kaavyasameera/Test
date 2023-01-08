package topic.abstraction;

public class AhsokLeylandHeavyTruck extends HeavyVehicles{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AhsokLeylandHeavyTruck heavyVehicle = new AhsokLeylandHeavyTruck();
		heavyVehicle.wheelCount();
		heavyVehicle.seatCount();
	}

	
	public void wheelCount() {
		System.out.println("Wheels count is: "+10);
		
	}

}
