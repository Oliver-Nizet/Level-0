import javax.swing.JOptionPane;

public class FingerCounter {
	public static void main(String[] args) {
		int userInput = JOptionPane.showOptionDialog(null, "Simple or Advanced Math?", "My Question", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Advanced", "Simple" }, null);
		if (userInput == 1) {
			simpleMath();
		}
		if (userInput == 0) {
			advancedMath();
		}
	}

	private static void simpleMath() {
		String num1 = JOptionPane.showInputDialog("Give me a starting number.");
		int num1asInt = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Give me a number that I will add to it.");
		int num2asInt = Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null, "Ok " + num1asInt);
		for (int i = 0; i < num2asInt; i++) {
			JOptionPane.showMessageDialog(null, num1asInt + " + 1 = " + (num1asInt + 1));
			num1asInt++;
		}
		JOptionPane.showMessageDialog(null, (num1asInt - num2asInt) + " + " + num2asInt + " = " + num1asInt + "!");
	}

	private static void advancedMath() {
		String bum1 = JOptionPane.showInputDialog("Give me a number that you want to multiply.");
		int bum1asInt = Integer.parseInt(bum1);
		String bum2 = JOptionPane.showInputDialog("Give me a number that you want multiply the previous number by.");
		int bum2asInt = Integer.parseInt(bum2);
		String bum3 = JOptionPane.showInputDialog("Give me a number that you want add to the product.");
		int bum3asInt = Integer.parseInt(bum3);
		int bum1asInt2 = bum1asInt;
		JOptionPane.showMessageDialog(null, "Ok " + bum1asInt);
		JOptionPane.showMessageDialog(null, bum1asInt + " is " + 1 + " times.");
		for (int i = 2; i < bum2asInt + 1; i++) {
			for (int j = 0; j < bum1asInt2; j++) {
				JOptionPane.showMessageDialog(null, bum1asInt + " + " + " 1 = " + (bum1asInt + 1));
				bum1asInt++;
			}
			JOptionPane.showMessageDialog(null, bum1asInt + " is " + i + " times.");
		}
	}

}
