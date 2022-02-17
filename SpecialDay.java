package computerClub;
import java.util.Scanner;

public class SpecialDay {

	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is the day");
		int day = input.nextInt();
		
		System.out.println("What is the month");
		int month = input.nextInt();
		
		if (day < 18 && month < 2) {
			
			System.out.println("Before");
			
		}
		
		else if (day == 18 && month == 2) {
			
			System.out.println("Special");
		}
		
		else if (day > 18 && month > 2) {
			
			System.out.println("After");
		}

		input.close();
	}
}