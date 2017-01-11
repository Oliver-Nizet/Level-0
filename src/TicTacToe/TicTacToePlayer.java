package TicTacToe;

public class TicTacToePlayer {

	public int getMove(TicTacToe ttt) {

		int move = getRule1(ttt);
		if (move == 0) {
			// TODO Auto-generated method stub
			for (int i = 1; i < 10; i++) {
				if (ttt.canMove(i))
					return i;
			}
		}
		return move;
	}

	int getRule1(TicTacToe ttt) {
		if (ttt.get(1) == ttt.get(4) && ttt.get(1) != ttt.OPEN && ttt.get(7) == ttt.OPEN) {
			return (7);
		}
		if (ttt.get(2) == ttt.get(5) && ttt.get(2) != ttt.OPEN && ttt.get(8) == ttt.OPEN) {
			return (8);
		}

		return 0;
	}
}
