/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the ASCII Museum!");
	System.out.println("Which exhibit would you like to visit?");
	System.out.println("1. Gaming");
	System.out.println("2. Weapons");
	System.out.println("3. Logos");
	String exhibit = sc.nextLine();
	if (exhibit.equals("Gaming")){
	System.out.println("Welcome to the Gaming exhibit!");
	System.out.println("Which piece do you want to see?");
	System.out.println("1. Pacman");
	System.out.println("2. Sonic the Hedgehog");
	String piece = sc.nextLine();
	if (piece.equals("Pacman")){
	System.out.println("         _____         ");
	System.out.println("     ,-~       ~-.     ");
	System.out.println("   ,^ ___     ___ ^.   ");
	System.out.println("  / .^   ^. .^   ^.   ");
	System.out.println(" Y  l    O! l    O!  Y ");
	System.out.println(" I_ `.___.' `.___.' _[ ");
	System.out.println(" I^~---------------~^I ");
	System.out.println(" I^~---------------~^I ");
	System.out.println("   ~-.,_______,.-~ /  ");
	System.out.println("   ^.             .^   ");
	System.out.println("     -..______.,-     ");
	}
	if (piece.equals("Sonic the Hedgehog")){
	System.out.println("      ___------__");
	System.out.println("|\\__-- /\\       _-");
	System.out.println("|/    __      -");
	System.out.println("//\\  /  \\    /__");
	System.out.println("|  o|  0|__     --_");
	System.out.println("\\____-- __ \\   ___-");
	System.out.println("(@@    __/  / /_");
	System.out.println("   -_____---   --_");
	}
	}
	else if (exhibit.equals("Weapons")){
	System.out.println("You are now in the Weapons exhibit!");
	System.out.println("Which piece do you want to see?");
	System.out.println("1. Knife");
	System.out.println("2. Explosives");
	String piece = sc.nextLine();
	if (piece.equals("Knife")){
	System.out.println("					");
	System.out.println(")xxxxx[;;;;;;;;;>");
	}
	if (piece.equals("Explosives")){
	System.out.println("      ______________________________    . \\  | / .");
	System.out.println("     /                            / \\     \\ \\ / /");
	System.out.println("    |                            | ==========  - -");
	System.out.println("     \\____________________________\\_/     / / \\ \\");
	}
	}	
	else if (exhibit.equals("Logos")){
	System.out.println("You are now in the Weapons exhibit!");
	System.out.println("Which piece do you want to see?");
	System.out.println("1. Coco-Cola");
	System.out.println("2. Kool-Aid");
	String piece = sc.nextLine();
	if(piece.equals("Coco-Cola")){
	System.out.println("                                      _       ");
	System.out.println("   ___ ___   ___ __ _        ___ ___ | | __ _ ");
	System.out.println("  / __/ _ \\ / __/ _` |_____ / __/ _ \\| |/ _` |");
	System.out.println(" | (_| (_) | (_| (_| |_____| (_| (_) | | (_| |");
	System.out.println("  \\___\\___/ \\___\\__,_|      \\___\\___/|_|\\__,_|");
	}
	if (piece.equals("Kool-Aid")){
	System.out.println("  ___  ____            _           ____      _     _  ");
	System.out.println(" |   |/   /           | |         /    \\    (_)   | | ");
	System.out.println(" |   '   /  ___   ___ | |  ___   /   _  \\    _  __| | ");
	System.out.println(" |      <  / _ \\ / _ \\| | |___| /   (_)  \\  | |/ _` | ");
	System.out.println(" |   .   \\| (_) | (_) | |      /   ____   \\ | | (_) | ");
	System.out.println(" |___|\\___\\\\___/ \\___/|_|     /___/    \\___\\|_|\\__,_| ");
	System.out.println("     _______________          ____________            ");
	System.out.println("    ( _____________ ) ___    (            )           ");
	System.out.println("    /    _     _    \\/ _ \\   (  OH YEAH!  )           ");
	System.out.println("   /    (,)   (,)    \\/ \\ \\ /_____________)           ");
	System.out.println("  |         _         | | |               _______     ");
	System.out.println("  |        (_)        | | |   _______    (  . .  )_   ");
	System.out.println("  |     .       .     |/ /   (  . .  )_  |   o   |_)  ");
	System.out.println("   \\     '.....'     /__/    |   o   |_)  ) '-' (     ");
	System.out.println("    \\               /         ) '-' (    (_______)    ");
	System.out.println("     )_____________(         (_______)                ");
	System.out.println("____(_______________)_________________________________");
	}
	}
	else{
	System.out.println("Not an exhibit. Choose something on the list.");
	}
	}
}
