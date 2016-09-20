import javax.swing.JOptionPane;

public class Derp {
	public static void main(String[] args) {
		String thing = JOptionPane.showInputDialog("Enter something.");
		JOptionPane.showMessageDialog(null, thing + " is derpy!");
	}
}
