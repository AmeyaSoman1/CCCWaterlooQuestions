package computerClub;
import java.util.Scanner;

public class VoteCount {
	
	public static void main (String [] args) {
		
		int counter = 0;
		int counterA = 0;
		int counterB = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.println("How many votes are there? ");
		int userinput = input.nextInt();
		
		System.out.println("Who are you voting for? ");
		String voting_Q = input.nextLine();
		
		if (voting_Q == "A") {
			
			counterA += 1;
		}
		
		else if (voting_Q == "B") {
			
			counterB += 1;
		}
		
		if (counterA > counterB) {
			
			System.out.print("A");
		}
		
		else if (counterA < counterB) {
			
			System.out.println("B");
		}
		
		while (counter <= userinput) {
			
			System.out.println("Who are you voting for? ");
			voting_Q = input.nextLine();
			counter = counter+1;
		}
		input.close();
	}
}
