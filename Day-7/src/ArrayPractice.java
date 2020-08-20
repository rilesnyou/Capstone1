
public class ArrayPractice {

	public static void main(String[] args) {
		String[] colors = new String[3];

		colors[0] = "red";
		colors[1] = "green";
		colors[2] = "blue";

		String thirdColor = colors[colors.length - 1];

		System.out.println(thirdColor);
		System.out.println(colors.length);

		colors[1] = "white";
		System.out.println(colors[1]);

		for (int index = 0; index < colors.length; index++) {
			System.out.println(colors[index]);
		}
		int len = colors.length;
		for (int i = 0; i < len; i++) {
			String color = colors[i];
			if(color != null) {
				System.out.println(colors[i]);
			}
		}
	}
}
