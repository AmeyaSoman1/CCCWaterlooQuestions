package computerClub;
import java.util.Scanner;

public class TelemarketerOrNot {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("");
		int num1 = input.nextInt();
		
		System.out.println("");
		int num2 = input.nextInt();
		
		System.out.println("");
		int num3 = input.nextInt();
		
		System.out.println("");
		int num4 = input.nextInt();
		
		if (num1 == 8 || num1 == 9 && num2 == num3 && num4 == 8 || num4 == 9) {
			
			System.out.println("ignore");
			
		}
		
		else {
			
			System.out.println("answer");
		}
		
		input.close();
	}

}
