package EnumFactory;

public class App {
	public static void main(String args[]){
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle car = vehicleFactory.getVehicle(VehicleType.CAR);
		car.startEngine();
		
		
		
		Vehicle bus = vehicleFactory.getVehicle(VehicleType.BUS);
		bus.startEngine();
	}
	
}
