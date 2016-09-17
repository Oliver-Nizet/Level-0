import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String today = "September 17th";
		String birthday = JOptionPane.showInputDialog("What is your birthday");
		if (birthday.equals(today)) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY! Your birthday is " + birthday + "!");
		} else {
			JOptionPane.showMessageDialog(null, "HAPPY UNBIRTHDAY! Your birthday is " + birthday + ", not " + today + "!");
		}
	}
}
