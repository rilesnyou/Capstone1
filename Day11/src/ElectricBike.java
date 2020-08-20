
public class ElectricBike extends Bike {
	
	private int powerLevel = 10;
	
	
	
	public int getPowerLevel() {
		return powerLevel;
	}



	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}



	public void charge() {
		powerLevel = 10;
	}
	
	@Override //override is to make a modified version of a method for this subclass
	public void go() {
		super.go(); // increments the speed still
		powerLevel--; //but also decrements the power-level at the same time for eBike only
	}



	@Override
	public String toString() {
		return "ElectricBike [powerLevel=" + powerLevel + ", Color=" + getColor() + ", Speed=" + getSpeed()
				+ "]";
	}
	
	
}
