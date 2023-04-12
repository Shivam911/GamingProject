package GuesserGame;

import java.util.Scanner;

import GuesserGame.Guesser;
import GuesserGame.Player;

public class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	boolean flag = true;
	Scanner scan = new Scanner(System.in);
	public boolean collectNumFromGuesser(int min, int max) {
		System.out.println("Hello guesser, please guess a number between "+min+" and "+max);
		Guesser gs = new Guesser();
		numFromGuesser = gs.guessNumber(min, max);
		if(validate(min, max, numFromGuesser, "Guesser")) {
			return flag;
		}
		else {
			System.out.println("Guesser wants to abort the game");
			flag = false;
			return flag;
		}
	}
	
	public boolean collectNumFromPlayer1(int min, int max) {
		System.out.println("Hello player 1, please guess a number between "+min+" and "+max);
		Player pl = new Player();
		numFromPlayer1 = pl.numGuessedByPl(min, max);
		if(validate(min, max, numFromPlayer1, "Player1")) {
			return flag;
		}
		else {
			System.out.println("Player 1 wants to abort the game");
			flag = false;
			return flag;
		}
	}
	
	public boolean collectNumFromPlayer2(int min, int max) {
		System.out.println("Hello player 2, please guess a number between "+min+" and "+max);
		Player pl = new Player();
		numFromPlayer2 = pl.numGuessedByPl(min, max);
		if(validate(min, max, numFromPlayer2, "Player2")) {
			return flag;
		}
		else {
			System.out.println("Player 2 wants to abort the game");
			flag = false;
			return flag;
		}
	}
	public boolean collectNumFromPlayer3(int min, int max) {
		System.out.println("Hello player 3, please guess a number between "+min+" and "+max);
		Player pl = new Player();
		numFromPlayer3 = pl.numGuessedByPl(min, max);
		if(validate(min, max, numFromPlayer3, "Player3")) {
			return flag;
		}
		else {
			System.out.println("Player 3 wants to abort the game");
			flag = false;
			return flag;
		}
	}
	public boolean validate(int min, int max, int numGuessed, String caller) {
		if(numGuessed <min || numGuessed>max) {
			System.out.println("Wrong choice");
			System.out.println("Do you want to continue or abort the game");
			System.out.println("If you want to continue the game then type yes otherwise type no");
			String choice = scan.next();
			if(choice.equalsIgnoreCase("yes")) {
				if(caller.equals("Guesser")) {
					collectNumFromGuesser(min, max);
				}
				else if(caller.equals("Player1")) {
					collectNumFromPlayer1(min, max);
				}
				else if(caller.equals("Player2")) {
					collectNumFromPlayer2(min, max);
				}
				else if(caller.equals("Player3")) {
					collectNumFromPlayer3(min, max);
				}
				return true;
			}
			else if(choice.equalsIgnoreCase("no")) {
				return false;
			}
			else {
				System.out.println("Wrong option choosen");
				return false;
			}
		}
		else {
			return true;
		}	
		
	}
	
	public void compare() {
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied, all the players guessed correctly");
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player 2 won the game");
			}
			else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player 3 won the game");
			}
			else {
				System.out.println("Player1 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 and Player 3 won the game");
			}
			else {
				System.out.println("Player2 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer3){
			System.out.println("Player3 won the game");
		}
		else {
			System.out.println("Game lost, no one won the game");
		}
	}
	

}
