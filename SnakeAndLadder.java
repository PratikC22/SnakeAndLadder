/**
 * The Player then checks for a Option. They are No Play, Ladder or Snake.
 *		- In Case of Snake the player moves behind
 *		- In Case of Ladder the player moves ahead by the number of position received in the die
 *		- Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same position
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package day4;

public class SnakeAndLadderUC3 {

	int initialPosition = 0, position = 0, WinPosition = 100, dieRoll, choice;
	final int noPlay = 0;
	final int ladder = 1;
	final int snake = 2;

	void PlayerPosition(int position) {
		System.out.println("Player starts at position 0");

		dieRoll = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		choice = (int) ((Math.floor(Math.random() * 10)) % 3);

		if (choice == noPlay) {
			System.out.println("Player does not move.");

		} else if (choice == ladder) {
			position += dieRoll;
			if (position > WinPosition) {
				position -= dieRoll;
			}
			if (position == WinPosition) {
				System.out.println("Player moves " + dieRoll + ". current position " + position);
				System.out.println("Player Wins!");
			}
			System.out.println("Player moves " + dieRoll + ". current position " + position);
		} else if (choice == snake) {
			position -= dieRoll;
			if (position < 0) {
				position = 0;
			}
			System.out.println("Player encounters a snake. moves back " + dieRoll + " positions." + " current position "
					+ position);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game simulation.");
		SnakeAndLadderUC3 Player1 = new SnakeAndLadderUC3();
		Player1.PlayerPosition(0);
	}

}
