package computerClub;

import java.util.Scanner;

public class SumacSequences {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is your first number: ");
		int firstNumber = input.nextInt();
		
		System.out.println("What is your second number: ");
		int secondNumber = input.nextInt();
		
		int count = 2;
		
		while (firstNumber >= secondNumber && firstNumber >= 0 && secondNumber >= 0) {
			
			count += 1;
			
			int thirdNumber = firstNumber - secondNumber;
			
			firstNumber = secondNumber;
			
			secondNumber = thirdNumber;
		}
		
		System.out.println(count);
		
		input.close();
	}
}