/**
 * Repeat till the Player reaches the winning position 100.
 * - Note In case the player position moves below 0, then the player restarts from 0
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package day4;

public class SnakeAndLadderUC4 {

	int initialPosition = 0, position = 0, WinPosition = 100, dieRoll, choice;
	final int noPlay = 0;
	final int ladder = 1;
	final int snake = 2;

	void PlayerPosition(int position) {
		System.out.println("Player starts at position 0");

		while (position <= WinPosition) {
			dieRoll = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
			choice = (int) ((Math.floor(Math.random() * 10)) % 3);

			if (choice == noPlay) {
				System.out.println("Player does not move.");

			} else if (choice == ladder) {
				position += dieRoll;
				if (position == WinPosition) {
					System.out.println("Player moves " + dieRoll + ". current position " + position);
					System.out.println("Player Wins!");
					break;
				}
				System.out.println("Player moves " + dieRoll + ". current position " + position);
			} else if (choice == snake) {
				position -= dieRoll;
				System.out.println("Player encounters a snake. moves back " + dieRoll + " positions."
						+ " current position " + position);
				if (position < 0) {
					position = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game simulation.");
		SnakeAndLadderUC4 Player1 = new SnakeAndLadderUC4();
		Player1.PlayerPosition(0);
	}

}
