import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to your Adventure. Give me commands to go north, south, east, or west.\nYour cordinates are: 0,0");
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("go north")) {
				y++;
			}
			if (line.equals("go south")) {
				y--;
			}
			if (line.equals("go east")) {
				x++;
			}
			if (line.equals("go west")) {
				x--;
			}
			System.out.println("Your cordinates are: " + x + "," + y);
		}
	}
}