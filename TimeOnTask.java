package computerClub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TimeOnTask {

	public static void main (String [] args) {

		List <Integer> chore_inputs = new ArrayList<Integer>();
		//List <String> chore_names = new ArrayList<String>();

		Scanner input = new Scanner (System.in);
		System.out.println ("How much time do you have? ");
		int total_time = input.nextInt(); 

		System.out.println ("What are the total number of chores? ");
		int chore_count = input.nextInt();

		int chore_number = 0;
		while (chore_number < chore_count) {

			chore_number++;
			System.out.println("How long does it take you to finish chore #" + chore_number + "?");
			int chore_time = input.nextInt();
			
		//	System.out.println("What is the name of the chore: ");
		//	String chore_name = input.nextLine();
			
			chore_inputs.add(chore_time); 
		//	chore_names.add(chore_name); 

		}
		
		// let's sort the list
		Collections.sort(chore_inputs);

		int completed_task_count = 0;
		int used_time = 0;
		int chore_idx = 0;
		int chore_max = chore_inputs.size();

		while (used_time <= total_time && chore_idx < chore_max) {

			int next_chore = chore_inputs.get(chore_idx);
			chore_idx++;
			if ((used_time + next_chore) <= total_time) {
				used_time = used_time + next_chore;
				completed_task_count++;
			}
		}

		System.out.println("completed task count:" + completed_task_count);
		
		for (int i = 0; i < completed_task_count; i++) {
			
			System.out.println(chore_inputs.get(i));

		}
		input.close();
	}

}

