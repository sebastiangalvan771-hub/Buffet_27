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
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money."); 
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If non match, you lose your money.");
		System.out.println("----------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) :");
		String ready = sc.nextLine();
		while ((ready.equals("Yes")) || (ready.equals("yes")) || (ready.equals("Y")) || (ready.equals("y"))){
				System.out.print("You have $"+money+". How much would you like to wager? ");
				
				System.out.println("");
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				num1 = (int)(Math.random()*10+1);
				num2 = (int)(Math.random()*10+1);
				num3 = (int)(Math.random()*10+1);
				System.out.println("----------------------------");
				System.out.println(" | "+num1+" | "+num2+" | "+num3+" | ");
				System.out.println("----------------------------");
		}
		if((num1==num2)&&(num1==num3)&&(num2==num3)){
			int wager = sc.nextInt();
			System.out.println("JACKPOT! You're wager has now been tripled!");
			wager = money*3;
			money = money+wager;
			wager = 0;
			System.out.println("You now have $"+money);
		}
		else if((num1==num2) || (num1==num3) || (num2==num3)){
			int wager = sc.nextInt();
			System.out.println("You won! You're wager has now been doubled!");
			wager = money*2;
			money = money+wager;
			wager = 0;
			System.out.println("You now have $"+money);
		}
			System.out.print("Would you like to play the slots? (Yes/yesY/y)");

		if ((ready.equals("No")) || (ready.equals("no")) || (ready.equals("N")) || (ready.equals("n"))){
			System.out.println("Sad to see you go! You still have $"+money+" left. Come again soon! Thanks!");
		}
		
	}
}
