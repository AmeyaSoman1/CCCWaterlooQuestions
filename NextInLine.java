package computerClub;
import java.util.Scanner;

public class NextInLine {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is the first child's age?");
		int youngest_age = input.nextInt();
		
		System.out.println("What is the middle child's age?");
		int middle_age = input.nextInt();
		
		int difference = middle_age - youngest_age;
		
		int largest_age = middle_age + difference;
		
		System.out.println("The age of the oldest child is " + largest_age);
		
		input.close();

	}
}
