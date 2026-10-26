/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width: ");
		int w = sc.nextInt();
		System.out.print("Please enter a height: ");
		int h = sc.nextInt();
		int x = 0;
		int z = 0;
		while (z<h){
			x=0;
			while (x<w)
				System.out.print("*");
				x++;
			}
		System.out.println();
		z++;
	}
}
