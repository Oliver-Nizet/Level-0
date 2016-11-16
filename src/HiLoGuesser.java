import javax.swing.JOptionPane;

public class HiLoGuesser {
	public static void main(String[] args) {
		int numOfGuesses = 11;
		int highestGuess = 100;
		int lowestGuess = 0;
		JOptionPane.showMessageDialog(null, "Pick a number between 1 and 100.");
		for (int i = 1; i < numOfGuesses; i++) {
			int average = ((highestGuess + lowestGuess) / 2);
			int userInput = JOptionPane.showOptionDialog(null, "Is " + average + " your number?", "ComputerGuess", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "You Guessed it!", "Lower", "Higher" }, null);
			System.out.println(userInput);
			if (userInput == 0) {
				JOptionPane.showMessageDialog(null, "HAHA! I guessed your number in " + i + " tries!");
				numOfGuesses -= 999999999;
			}
			if (userInput == 2) {
				lowestGuess = average;
			}
			if (userInput == 1) {
				highestGuess = average;
			}

		}
	}

}
