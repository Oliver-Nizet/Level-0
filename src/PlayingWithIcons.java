import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PlayingWithIcons {
	public static void main(String[] args) {
		String myMessage = JOptionPane.showInputDialog("What do you want your message to be?");
		String myTitle = JOptionPane.showInputDialog("What do you want your title to be?");
		JOptionPane.showMessageDialog(null, myMessage, myTitle, 0, getIcon());
	}

	static ImageIcon getIcon() {
		return new ImageIcon("image/TheLeague.jpg");
	}
}
