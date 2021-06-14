/**
 * Snake And Ladder Program
 * Report the number of times the dice was played to win the game and also the position after every die role
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package day4;

public class SnakeAndLadderUC6 {

	int initialPosition = 0, position = 0, WinPosition = 100, count = 0, dieRoll, choice;
	final int noPlay = 0;
	final int ladder = 1;
	final int snake = 2;

	void PlayerPosition(int position) {
		System.out.println("Player starts at position 0");

		while (position <= WinPosition) {
			dieRoll = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
			choice = (int) ((Math.floor(Math.random() * 10)) % 3);

			if (choice == noPlay) {			// no move.
				System.out.println("Player does not move.");

			} else if (choice == ladder) {
				position += dieRoll;
				if (position > WinPosition) {	// If position > WinPosition, moves are undone.
					position -= dieRoll;
				}
				if (position == WinPosition) {	// only if position = 100, win is declared.
					System.out.println("Player moves " + dieRoll + ". current position " + position);
					System.out.println("Player Wins!"+" It took "+count+" die rolls.");
					break;
				}
				System.out.println("Player moves " + dieRoll + ". current position " + position);
			} else if (choice == snake) {	// Encountered a snake, moves back positions.
				position -= dieRoll;
				System.out.println("Player encounters a snake. moves back " + dieRoll + " positions."
						+ " current position " + position);
				if (position < 0) {
					position = 0;
				}
			}
			count++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game simulation.");
		SnakeAndLadderUC6 Player1 = new SnakeAndLadderUC6();
		Player1.PlayerPosition(0);
	}

}
