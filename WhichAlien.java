package computerClub;

import java.util.Scanner;

public class WhichAlien {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("How many antennas? ");
		int antennaCount = input.nextInt();
		
		System.out.println("How many eyes? ");
		int eyeCount = input.nextInt();
		
		
		if (antennaCount >= 3 && eyeCount <= 4) {
			
			System.out.println("TroyMartian");
		}
		
		else if (antennaCount <= 6 && eyeCount >= 2) {
			
			System.out.println("VladSaturnian");

		}
		
		else if (antennaCount >= 2 && eyeCount <= 3) {
			
			System.out.println("GraemeMercurian");
		}
	
		input.close();
	}

}
