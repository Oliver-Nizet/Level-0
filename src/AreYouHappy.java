import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		speak("Are You Happy");
		String answer1 = JOptionPane.showInputDialog("");
		if (answer1.equalsIgnoreCase("yes")) {
			speak("Keep doing whatever you're doing.");
		}
		if (answer1.equalsIgnoreCase("no")) {
			speak("Do you want to be happy?");
			String answer2 = JOptionPane.showInputDialog("");
			if (answer2.equalsIgnoreCase("yes")) {
				speak("Change something.");
				String answer3 = JOptionPane.showInputDialog("");
				if (answer3.equalsIgnoreCase("yes")) {
					speak("Have fun being happy.");
				}
				if (answer3.equalsIgnoreCase("no")) {
					speak("Don't have fun being sad.");
				}
			}
			if (answer2.equalsIgnoreCase("no")) {
				speak("Keep doing whatever you're doing.");
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
