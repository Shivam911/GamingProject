package GuesserGame;

import java.util.Scanner;

public class Player {
	
	int numGuessedByPl;
	Scanner sc = new Scanner(System.in);
	public int numGuessedByPl(int min, int max){
		numGuessedByPl = sc.nextInt();
		return numGuessedByPl ;
		
	}
	
	

}
