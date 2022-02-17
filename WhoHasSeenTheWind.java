package computerClub;

import java.util.Scanner;

public class WhoHasSeenTheWind {

	public static void main (String args[]) {

		Scanner input = new Scanner (System.in);
		System.out.println ("What is the humidity? ");
		int humidity = input.nextInt();

		System.out.println ("How many hours will Margaret wait? ");
		int numberOfHours = input.nextInt();
		
		int t = 1;
		
		int altitude = -6*(t*t*t*t) + humidity*(t*t*t) + 2*(t*t) + t;
		
		while (t < numberOfHours && altitude > 0) {
			
			t += 1;
			altitude = -6*(t*t*t*t) + humidity*(t*t*t) + 2*(t*t) + t;
		}
		
		if (altitude > 0) {
			
			System.out.println("The balloon does not touch the ground in the given time.");
		}
		
		else {
			
			System.out.println ("The balloon touches the ground at hour: " + t);
		}
		
		input.close();
	}
}