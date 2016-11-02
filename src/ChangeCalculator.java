import java.text.NumberFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have, and convert their answer
		String nickles = JOptionPane.showInputDialog("How many nickles do you have?");
		int nicklesAsInt = Integer.parseInt(nickles);
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesAsInt = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quartersAsInt = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double
		// variable
		double total = ((nicklesAsInt * 5) + (dimesAsInt * 10) + (quartersAsInt * 25)) / 100.0;
		// Tell the user how much money they have
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null, "You have " + nf.format(total));
	}
}
