/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Type in a number");
	int x = sc.nextInt();
	int y = 0;
	while (true){
		if(y==x){
		break;
		}
	
	System.out.println(name);
	y = y + 1;
}
	}
}
