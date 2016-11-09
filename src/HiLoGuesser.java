import java.util.Random;

import javax.swing.JOptionPane;

public class HiLoGuesser {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Pick a number between 1 and 100.");
		int numOfGuesses = 30;
		int randomGuess = new Random().nextInt(101);
		for (int i = 0; i < numOfGuesses; i++) {
			int userInput = JOptionPane.showOptionDialog(null, "Is " + randomGuess + " your number?", "ComputerGuess",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "You Guessed it!", "Lower", "Higher" },
					null);
			System.out.println(userInput);
			if (userInput == -1) {
				JOptionPane.showMessageDialog(null, "ANSWER MY QUESTION!");
				numOfGuesses++;
			}
			if (userInput == 0) {
				JOptionPane.showMessageDialog(null, "HAHA! Another win for me!");
				numOfGuesses -= 999999999;
			}
			if (userInput == 2) {
				randomGuess++;
			}
			if (userInput == 1) {
				randomGuess--;
			}

		}
	}

}
