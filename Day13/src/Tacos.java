
public class Tacos {
	
	private String type;
	private int tacoCount;
	private boolean tasty;
	
	public Tacos() {
		
	}
	
	public Tacos(String type, int tacoCount, boolean tasty) {
		super();
		this.type = type;
		this.tacoCount = tacoCount;
		this.tasty = tasty;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTacoCount() {
		return tacoCount;
	}

	public void setTacoCount(int tacoCount) {
		this.tacoCount = tacoCount;
	}

	public boolean isTasty() {
		return tasty;
	}

	public void setTasty(boolean tasty) {
		this.tasty = tasty;
	}

	@Override
	public String toString() {
		return "Taco [type=" + type + ", tacoCount=" + tacoCount + ", tasty="
				+ tasty + "]";
	}

}
