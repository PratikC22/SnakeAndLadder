/**
 * Snake and ladder program
 * The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the number between 1 to 6
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package day4;

public class SnakeAndLadderUC2 {
	int position = 0; int dieRoll;
	void PlayerPosition(int position) {
		System.out.println("Player position is "+position);
		dieRoll = (int)((Math.floor(Math.random() * 10)) % 6) + 1;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game simulation.");
		SnakeAndLadderUC2 Player1 = new SnakeAndLadderUC2();
		Player1.PlayerPosition(0);
	}

}
