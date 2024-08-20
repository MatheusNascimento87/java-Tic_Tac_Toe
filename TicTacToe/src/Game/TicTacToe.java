package quest4;

public class TicTacToe {
	private int play;
	private char[][] ticTacToe;

	public TicTacToe() {
		ticTacToe = new char[3][3];
		play = 1;
	}

	public int getPlay() {
		return play;
	}

	public char[][] getTicTacToe() {
		return ticTacToe;
	}

	public void setTicTacToe(char[][] ticTacToe) {
		this.ticTacToe = ticTacToe;
	}

	public boolean validPlay(int line, int column, char sign) {
		if (ticTacToe[line][column] == 'X' || ticTacToe[line][column] == 'O') {
			return false;
		} else {
			ticTacToe[line][column] = sign;
			play++;
			return true;
		}
	}

	public void printTable() {
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe[i].length; j++) {
				System.out.print(ticTacToe[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public boolean checkWinner(char sign) {
		if ((ticTacToe[0][0] == sign && ticTacToe[0][1] == sign && ticTacToe[0][2] == sign) ||     // first line
				(ticTacToe[1][0] == sign && ticTacToe[1][1] == sign && ticTacToe[1][2] == sign) || // second line
				(ticTacToe[2][0] == sign && ticTacToe[2][1] == sign && ticTacToe[2][2] == sign) || // third line
				(ticTacToe[0][0] == sign && ticTacToe[1][0] == sign && ticTacToe[2][0] == sign) || // first column
				(ticTacToe[0][1] == sign && ticTacToe[1][1] == sign && ticTacToe[2][1] == sign) || // second column
				(ticTacToe[0][2] == sign && ticTacToe[1][2] == sign && ticTacToe[2][2] == sign) || // third column
				(ticTacToe[0][0] == sign && ticTacToe[1][1] == sign && ticTacToe[2][2] == sign) || // main diagonal
				(ticTacToe[0][2] == sign && ticTacToe[1][1] == sign && ticTacToe[2][0] == sign)) { // sub diagonal
			return true;
		}
		return false;
	}
	
	public boolean player1Turn() {
		if(play %2 == 1) {
			return true;
		}
		return false;
	}

}
