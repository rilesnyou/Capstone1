
public class GearedBike extends Bike {
	
	
	private int gear = 1;

	public int getGear() {
		return gear;
	}
	@Override
	public void go() {
		for (int i = 0; i < gear; i++) {
			super.go();
		}
	}
	
	public void shiftUp() {
		if (gear < 10) {
		gear++;
		}
	}
	
	public void shiftDown() {
		if (gear > 1) {
			gear--;
		}
	}
	@Override
	public String toString() {
		return "GearedBike [gear=" + gear + ", getColor()=" + getColor() + ", getSpeed()=" + getSpeed() + "]";
	}
	
	
}
