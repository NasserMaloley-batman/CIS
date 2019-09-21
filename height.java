import java.util.Scanner;

public class height {

	public static void main(String[] args) {

		Scanner feet = new Scanner(System.in);
		System.out.println("\n\nFeet: ");

		int feet_num = feet.nextInt();

		int feet_to_inches = feet_num * 12;

		//System.out.println(feet_to_inches);

		Scanner inches = new Scanner(System.in);
		System.out.println("\n\nInches: ");

		int inch_num = inches.nextInt();

		double centimeteres = (inch_num + feet_to_inches) * 2.54;

		System.out.println("You're height in centimeters is " + centimeteres + " cm");





	}
}