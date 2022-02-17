package computerClub;
import java.util.Scanner;

public class QuadrantSelection {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("");
		int x_axis = input.nextInt();
		
		System.out.println("");
		int y_axis = input.nextInt();
		
		if (x_axis > 0 && y_axis > 0) {
			
			System.out.println("1");
		}
		
		else if (x_axis < 0 && y_axis > 0) {
			
			System.out.println("2");
		}
		
		else if (x_axis < 0 && y_axis < 0) {
			
			System.out.println("3");
		}
		
		else if (x_axis > 0 && y_axis < 0) {
			
			System.out.println("4");
		}
		
		input.close();
	}

}
