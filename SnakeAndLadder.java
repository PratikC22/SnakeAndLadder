/**
 * Snake and Ladder Program.
 * Snake and Ladder game played with single player at start position 0
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package day4;

public class SnakeAndLadderUC1 {
	int position = 0;
	void PlayerPosition(int position) {
		System.out.println("Player position is "+position);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game simulation.");
		SnakeAndLadderUC1 Player1 = new SnakeAndLadderUC1();
		Player1.PlayerPosition(0);
	}

}
