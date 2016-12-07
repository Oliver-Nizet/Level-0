import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to your Adventure. You are in a forest. What should you do?");
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("look down")) {
				System.out.println("There is a paper.");
			}
			if (line.equals("read paper")) {
				System.out.println("It sais: If you go west you will find the next clue.");
			}
		}
	}
}
