import java.util.Scanner;
public class LongerNames {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in)) {
			String name1,name2;
			int l1=0,l2=0;
			System.out.println("Please enter the first name");
			name1=scnr.nextLine();
			System.out.println("Please enter the second name");
			name2=scnr.nextLine();
			l1=name1.length();
			l2=name2.length();
			if(l1>l2) 
			{
				System.out.println(name1 + " is larger than " + name2);
			}
			else if(l2>l1)  {
				System.out.println(name2 + " is larger than " + name1);
			}
			else
			{
				System.out.println(name1 + " & " + name2 + " are both the same length.");
		}
		
	}

	}
}