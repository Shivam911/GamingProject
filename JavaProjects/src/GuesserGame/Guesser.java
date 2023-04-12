package GuesserGame;

import java.util.Scanner;

public class Guesser {
	
	int guessedNum;
	Scanner scan = new Scanner(System.in);
	int guessNumber(int min, int max){	
		guessedNum = scan.nextInt();
		return guessedNum;
		
	}

}
