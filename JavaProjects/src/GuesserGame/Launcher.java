package GuesserGame;

import java.util.Scanner;

public class Launcher {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets start the game");
		Scanner sc = new Scanner(System.in);
		int min, max;
		System.out.println("Please choose minimum number");
		min = sc.nextInt();
		System.out.println("Please choose maximum number");
		max = sc.nextInt();
		Umpire umpire = new Umpire();
		  if(umpire.collectNumFromGuesser(min, max)) {
		  if(umpire.collectNumFromPlayer1(min, max)) {
		  if(umpire.collectNumFromPlayer2(min, max)) {
		  if(umpire.collectNumFromPlayer3(min, max)) { umpire.compare(); } } } }
		 
	    System.out.println("Game over");
		/*
		 * if(!umpire.collectNumFromPlayer1(min, max)) System.exit(0);
		 * if(!umpire.collectNumFromPlayer2(min, max)) System.exit(0);
		 * if(umpire.collectNumFromPlayer3(min, max)) System.exit(0);
		 */
		
	}

}
