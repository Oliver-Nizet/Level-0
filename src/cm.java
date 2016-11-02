import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cm {
	public static void main(String[] args) {

	}

	static ImageIcon getIcon() {
		return new ImageIcon("image/TheLeague.jpg");
	}

	public static void cm(String message) {
		JOptionPane.showMessageDialog(null, message, "Ur Message", 0, getIcon());
	}
}