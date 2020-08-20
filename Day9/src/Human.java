// blueprint for creating objects
public class Human {

	/*
	 *  instance variables (fields)
	 *  attributes
	 */
	private String name;
	private int age;
	private int height;
	private String color;
	private String eye;

	/*
	 * constructors
	 * 
	 * special method creates objects
	 * needs to be public needs to match class name (exactly)
	 * 
	 */

	public Human(String name, int age, int height, String color, String eye) {

		// this referring to current instance
		// parameter matches field name
		this.name = name;      // Jill
		this.age = age;        // 29
		this.height = height;  // 60
		this.color = color;
		this.eye = eye;
		
	}

	public Human(String firstName) {

		// storing value passed into constructor
		// in the instance variable
		// java implicitly does assigns value
		name = firstName;
	}
	
//	public Human(String favColor) {
//		color = favColor;
//	}
	
	/*
	 * instance methods (non-static)
	 * 
	 * functions/actions
	 */
	
	public void greeting() {
		System.out.println("Hi, I'm "+name+".");
	}
	
	/*
	 * SETTERS 
	 * 
	 * sets the object's instance variables(fields)
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEye(String eye) {
		this.eye = eye;
	}
	
	/*
	 * GETTER
	 * 
	 * gets and returns an object's field value
	 */
	public String getName() {
		// java implicitly accesses field
		return name;
	}
	public int getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	public String getEye() {
		return eye;
	}
	
	

	// optional override annotation
	@Override
	public String toString() {

		return String.format("Human[name=%s,age=%d,height=%d,eye=%s,color=%s]", name, age, height, eye, color);
	}

}