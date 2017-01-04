import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Starz {

	public static void main(String[] args) {
		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to
		// see the result of this line.
		Tortoise.setX(50);
		Tortoise.setY(200);
		Tortoise.show();
		Tortoise.setSpeed(10);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		int bekfast = new Random().nextInt(10);
		for (int i = 0; i < bekfast; i++) {
			Star();
			Tortoise.penUp();
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(-90);
			Tortoise.penDown();
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

	private static void Star() {
		for (int i = 0; i < 5; i++) {
			Tortoise.turn(144);
			Tortoise.move(30);
		}
	}

}
