
public class BikeDemo {

	public static void main(String[] args) {
		
//		non-static methods can be called by using a variable [bike = a new Bike() method/class]
		Bike bike = new Bike();
//		static methods are called using the class method
//		Bike.name();   [bike = class method]
		System.out.println(bike);
		
		Bike bike2 = new Bike("red");
		System.out.println(bike2);
		
		bike.go();
		System.out.println(bike.getSpeed());
		
		ElectricBike eBike = new ElectricBike();
		eBike.go();
		eBike.setPowerLevel(5);
		System.out.println(eBike);
		System.out.println(eBike.getPowerLevel());
		
		GearedBike gBike = new GearedBike();
		gBike.shiftUp();
		gBike.shiftUp();
		gBike.go();
		gBike.go();
		System.out.println(gBike);
	}

}
