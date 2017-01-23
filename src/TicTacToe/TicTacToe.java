xgxpackage TicTacToe;
import java.util.Scanner;

public class TicTacToe {
	// Rule 1: If I have a winning move, take it.
	// Rule 2: If the opponent has a winning move, block it.
	// Rule 3: If I can create a fork (two winning ways) after this move, do it.
	// Rule 4: Do not let the opponent creating a fork after my move. (Opponent
	// may block your winning move and create a fork.)
	// Rule 5: Place in the position such as I may win in the most number of
	// possible ways.
	// Rule 1 and 2 can be programmed easily. Rule 3 is harder. Rule 4 is even
	// harder because you need to lookahead one opponent move, after your move.
	// For rule 5, you need to count the number of possible winning ways.
	// Rule-based strategy is only applicable for simple game such as
	// Tic-tac-toe and Othello.

	public static char X = 'X';
	public static char O = 'O';
	public static char OPEN = ' ';
	public static String TIE_MESSAGE = "The game is tie!";

	char one = OPEN;
	char two = OPEN;
	char three = OPEN;

	char four = OPEN;
	char five = OPEN;
	char six = OPEN;

	char seven = OPEN;
	char eight = OPEN;
	char nine = OPEN;

	public char get(int i) {
		switch (i) {
		case 1:
			return one;
		case 2:
			return two;
		case 3:
			return three;

		case 4:
			return four;
		case 5:
			return five;
		case 6:
			return six;

		case 7:
			return seven;
		case 8:
			return eight;
		case 9:
			return nine;

		default:
			return '?';
		}
	}

	public boolean canMove(int i) {
		switch (i) {
		case 1:
			return one == OPEN;
		case 2:
			return two == OPEN;
		case 3:
			return three == OPEN;

		case 4:
			return four == OPEN;
		case 5:
			return five == OPEN;
		case 6:
			return six == OPEN;

		case 7:
			return seven == OPEN;
		case 8:
			return eight == OPEN;
		case 9:
			return nine == OPEN;
		default:
			return false;
		}
	}

	public boolean set(int i, char c) {
		switch (i) {
		case 1:
			one = c;
			break;
		case 2:
			two = c;
			break;
		case 3:
			three = c;
			break;

		case 4:
			four = c;
			break;
		case 5:
			five = c;
			break;
		case 6:
			six = c;
			break;

		case 7:
			seven = c;
			break;
		case 8:
			eight = c;
			break;
		case 9:
			nine = c;
			break;
		default:
			return false;
		}
		return true;
	}

	public String getWinner() {
		// Rows
		if (one == two && two == three && three != OPEN) {
			return "Winner is: " + three;
		}
		if (four == five && five == six && six != OPEN) {
			return "Winner is: " + six;
		}
		if (seven == eight && eight == nine && nine != OPEN) {
			return "Winner is: " + nine;
		}
		// Cols
		if (one == four && four == seven && seven != OPEN) {
			return "Winner is: " + seven;
		}
		if (two == five && five == eight && eight != OPEN) {
			return "Winner is: " + eight;
		}
		if (three == six && six == nine && nine != OPEN) {
			return "Winner is: " + nine;
		}
		// Diagonal
		if (one == five && five == nine && nine != OPEN) {
			return "Winner is: " + nine;
		}
		if (three == five && five == seven && seven != OPEN) {
			return "Winner is: " + seven;
		}
		return TIE_MESSAGE;
	}

	void print() {
		System.out.println(one + "|" + two + "|" + three);
		System.out.println("-+-+-");
		System.out.println(four + "|" + five + "|" + six);
		System.out.println("-+-+-");
		System.out.println(seven + "|" + eight + "|" + nine);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Thank you for playing Tic-Tac-Toe!");
		System.out.println("We will use #'s to represent moves here are the values:");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String first = "";
		while (!"Yes".equalsIgnoreCase(first) && !"No".equalsIgnoreCase(first)) {
			System.out.println("Would you like to go first?");
			first = scanner.nextLine();
			System.out.println();
		}
		int moveCount = 0;
		boolean xMove = true;
		TicTacToePlayer player = new TicTacToePlayer();
		TicTacToe ttt = new TicTacToe();
		if ("No".equalsIgnoreCase(first)) {
			int move = player.getMove(ttt);
			ttt.set(move, xMove ? X : O);
			xMove = !xMove;
			System.out.println("Computer move is: " + move);
			ttt.print();
			moveCount++;
		}

		boolean gameOver = false;
		while (!gameOver && moveCount < 9) {
			int move = -1;
			while (!ttt.canMove(move)) {
				System.out.println("Your move:");
				try {
					move = Integer.parseInt(scanner.nextLine());
					System.out.println();
				} catch (Exception e) {

				}
			}
			ttt.set(move, xMove ? X : O);
			xMove = !xMove;
			ttt.print();
			if (!TIE_MESSAGE.equals(ttt.getWinner()))
				gameOver = true;
			if (!gameOver && moveCount < 9) {
				move = player.getMove(ttt);
				if (ttt.canMove(move)) {
					ttt.set(move, xMove ? X : O);
					xMove = !xMove;
					System.out.println("Computer move is: " + move);
					ttt.print();
					if (!TIE_MESSAGE.equals(ttt.getWinner()))
						gameOver = true;
				} else {
					gameOver = true;
					System.out.println("The computer gave up!");
				}
			}
		}
		System.out.println("Game is over: " + ttt.getWinner());
		scanner.close();
	}
}
