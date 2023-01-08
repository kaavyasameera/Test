package topic.abstraction;

public class AhoskLeylandMiniTransportVehicle extends HeavyVehicles{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AhoskLeylandMiniTransportVehicle miniVehicle = new AhoskLeylandMiniTransportVehicle();
		miniVehicle.wheelCount();
		miniVehicle.seatCount();
	}

	
	public void wheelCount() {
		
		System.out.println("Wheels count is: "+6);
	}

}
