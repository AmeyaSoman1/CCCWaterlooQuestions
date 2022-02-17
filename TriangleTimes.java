package computerClub;
import java.util.Scanner;

public class TriangleTimes {

	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Enter the value of side A: ");
		int userinput_A = input.nextInt();

		System.out.print("Enter the value of side B: ");
		int userinput_B = input.nextInt();

		System.out.print("Enter the value of side C: ");
		int userinput_C = input.nextInt();

		if (userinput_A + userinput_B + userinput_C == 180) {

			if (userinput_A == userinput_B && userinput_B == userinput_C) {

				System.out.println("Equilateral");
			}

			else if (userinput_A == userinput_B || userinput_B == userinput_C || userinput_C == userinput_A) {

				System.out.println("Isosceles");
			}

			else if (userinput_A != userinput_B && userinput_B != userinput_C && userinput_C != userinput_A) {

				System.out.println("Scalene");
			}
		}

		else {
			System.out.println("Error");
		}


		input.close();
	}
}

