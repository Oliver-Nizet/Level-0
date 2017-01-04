import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to your Adventure. Give me commands to go north, south, east, or west.\nYour coordinates are: 0,0");
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
			System.out.println("Your coordinates are: " + x + "," + y);

			if (line.equals("go north") || line.equals("go south") || line.equals("go east") || line.equals("go west")) {
				System.out.println("Now you know how to move around. Go to the coordinates 2,3");
			}
			if (x == 2 && y == 3) {
				System.out.println("You found a locked chest on the ground. There is a slip of paper on it that says that the key is at the coordinates -6, 4");
			}
		}
	}
}