
public class Bike {
		
		private String color = "black";
		private int speed = 0;
		
		
		public Bike() {
			super();
		}
		public Bike(String color) {
			super();
			this.color = color;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSpeed() {
			return speed;
		}
		
		public void go() {
			speed += 1;
		}
		@Override
		public String toString() {
			return "Bike [color=" + color + ", speed=" + speed + "]";
		}
		
		
		
	}


