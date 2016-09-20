import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 1st";
		String dadsBirthday = "December 24th";
		String myBirthday = "October 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog("Whose birthday would you like to know? Mom, Dad, or Me?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if (answer.equals("mom")) {	
			//print mom's birthday
			JOptionPane.showMessageDialog(null, "My mom's birthday is " + momsBirthday + ".");
		}	
		// 5. if user asked for "dad"
		else if (answer.equals("dad")) {
			// print dad's birthday
			JOptionPane.showMessageDialog(null, "My dad's birthday is " + dadsBirthday + ".");
		}	
		// 6. if user asked for your name
		else if (answer.equals("you")) {
			// print myBirthday
			JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday + ".");
		} else {	
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	} 
}