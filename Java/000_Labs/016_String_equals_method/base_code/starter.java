/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if (role.equals("Wizard")){
		System.out.println("You've chosen the Wizard! Avata ka bacon.");
		}
		else if(role.equals("Warrior")){
		System.out.println("You've chosen the Warrior! RAHHHH!");
		}
		else if(role.equals("Rogue")){
		System.out.println("You've chosen the Rogue! Shhhhh.");
		}
		else{
		System.out.print("You've decided not to chose a role. Rerun program.");
		}
		
	}
}
