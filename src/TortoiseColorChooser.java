import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
	for (int i = 0; i < 100120219; i++) {
		//3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("Enter a color in the rainbow.");
		//4. use an if/else statement to set the pen color that the user requested
		if (color.toUpperCase().equals("RED")) {
			Tortoise.setPenColor(Color.RED);	
		}
		if (color.toUpperCase().equals("ORANGE")) {
			Tortoise.setPenColor(new Color(255,136,68));	
		}
		if (color.toUpperCase().equals("YELLOW")) {
			Tortoise.setPenColor(Color.YELLOW);	
		}
		if (color.toUpperCase().equals("GREEN")) {
			Tortoise.setPenColor(Color.GREEN);	
		}
		if (color.toUpperCase().equals("BLUE")) {
			Tortoise.setPenColor(Color.BLUE);	
		}
		if (color.toUpperCase().equals("PURPLE")) {
			Tortoise.setPenColor(new Color(136,0,153));	
		} else if (color.isEmpty()) {
//5. if the user doesn’t enter anything, choose a random color
			Random blah = new Random();
			Tortoise.setPenColor(new Color(blah.nextInt(255), blah.nextInt(255), blah.nextInt(255)));
		}	
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(7);
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
	}
	}
}
