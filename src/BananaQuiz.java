import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like bananas");
		// 2. if they say no,
		if (answer.equals("no")) {
			// tell them they are crazy
			JOptionPane.showMessageDialog(null, "You are CRAZY");
			// and end quiz
		} else if (answer.equals("yes")) {
			// ask them what is their favorite hobby
			String answer2 = JOptionPane.showInputDialog("What is you favorite hobby?");
			// show a pop up that says "<your hobby> is much better with
			// bananas!"
			JOptionPane.showMessageDialog(null, answer2 + " is much better with bananas!");
		} else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}