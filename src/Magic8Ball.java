import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	for (int i = 0; i < 99999; i++) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"Ω (int i = 0; i < args.length; i++) {
		int random = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Enter your question and shake the mouse.");
	// 5. If the random number is 0
		if (random == 0) {
	// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Of Course!");
		}	
	// 6. If the random number is 1
		if (random == 1) {
	// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "No Way!");
		}
	// 7. If the random number is 2
		if (random == 2) {
	// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google.");
		}
	// 8. If the random number is 3
		if (random == 3) {
	// -- write your own answer
			JOptionPane.showMessageDialog(null, "SHAKE HARDER!!!");
		}
		}	
	}
}
