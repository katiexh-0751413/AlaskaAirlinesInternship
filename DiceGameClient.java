import java.util.Arrays;
import java.util.Scanner;

public class DiceGameClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Would you like to play Greed Kata (y/n)? ");
		String input = scan.next().toLowerCase();
		int endScore = 0;
		
		while (!input.equals("n")) {
			if (!input.equals("y")) {
				System.out.println("Please enter a valid response.");
			} else {
				DiceGame game = new DiceGame();
				game.rollFive();
				game.sumPoints();
				
				System.out.println("Values: " + Arrays.toString(game.getValues()));
				System.out.println("Points: " + game.getTotalPoints());
				endScore += game.getTotalPoints();
			}
			System.out.print("Would you like to play Greed Kata (y/n)? ");
			input = scan.next();
			if (input.equals("n")) {
				System.out.println("Thank you for playing Greed Kata. Your total score is: " + endScore);
			}
		}
	}
}
