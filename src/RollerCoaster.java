import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		int maxHeight = 4;
		String height = JOptionPane.showInputDialog("How tall are you?");
		double height2 = Double.parseDouble(height);
		if (height2 >= maxHeight) {
			JOptionPane.showMessageDialog(null, "You can ride the roller coaster!");
		} else {
			JOptionPane.showMessageDialog(null, "You can't ride the roller coaster.");
		}
	}
}
