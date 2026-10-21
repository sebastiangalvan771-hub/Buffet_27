/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money."); 
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If non match, you lose your money.");
		System.out.println("----------------------------------------------------");
		System.out.println("");
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
		String ready = sc.nextLine();
		if ((ready.equals("Yes")) || (ready.equals("yes")) || (ready.equals("Y")) || (ready.equals("y"))){
				System.out.println("You have $"+money+". How much would you like to wager?" );
				int wager = sc.nextInt();
				System.out.println("")
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
		}
		else if((ready.equals("No")) || (ready.equals("no")) || (ready.equals("N")) || (ready.equals("n"))){
			System.out.println("Sad to see you go! You still have $"+wager+" left. Come again soon! Thanks!");
		}
		
	}
}
