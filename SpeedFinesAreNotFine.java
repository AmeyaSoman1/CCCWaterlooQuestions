package computerClub;
import java.util.Scanner;

public class SpeedFinesAreNotFine {

	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);
		System.out.println ("What is the speed limit? ");
		int speedLimit = input.nextInt();

		System.out.println ("What is your speed? ");
		int speed = input.nextInt();

		if (speed <= speedLimit) {
			
			System.out.println("Congratulations, you are within the speed limit!");
		}
		
		else if (speed - speedLimit < 21 && speed - speedLimit > 0) {
			
			System.out.println("You are speeding and your fine is $100");
		}
		
		else if (speed - speedLimit > 20 && speed - speedLimit < 30) {
			
			System.out.println("You are speeding and your fine is $270");
		}
		
		else if (speed - speedLimit > 30) {
			
			System.out.println("You are speeding and your fine is $500");
		}
		
		input.close();
	}
}
