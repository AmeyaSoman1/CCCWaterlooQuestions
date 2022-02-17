package computerClub;
import java.util.Scanner;

public class TournamentSelection {

	public static void main (String [] args) {

		int counter_W = 0;

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < 6; i ++) {

			String userinput = input.nextLine();

			if (userinput.equals("W")) {
				
				counter_W += 1;
				
			}
		}

		if (counter_W == 5 || counter_W == 6) {	
			System.out.println("1");
		}
		
		else if (counter_W == 3 || counter_W == 4) {
			System.out.println("2");
		}
		
		else if (counter_W == 1 || counter_W == 2) {
			System.out.println("3");
		}
		
		else if (counter_W == 0) {
			System.out.println("-1");
		}
		
		input.close();

	}
}
