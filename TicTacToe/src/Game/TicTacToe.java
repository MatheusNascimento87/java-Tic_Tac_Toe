package Game;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] ticTacToe = new char[3][3];
		int play = 1, line=0, column=0;
		char sign;
		System.out.println("Player 1 = X");
		System.out.println("Player 2 = O");
		boolean win = false;
		while(!win) {
			if(play%2 == 1) {
				System.out.println("Player 1 turn!");
				sign = 'X';
			}else {
				System.out.println("Player 2 turn!");
				sign = 'O';
			}
			boolean validLine = false;
			while(!validLine) {
				System.out.println("choose the line to play (1-3): ");
				line = scan.nextInt();
				if(line>=1 && line<=3) {
					validLine = true;
				}else {
					System.out.println("Invalid line! Try again");
				}
			}
			boolean validColumn = false;
			while(!validColumn) {
				System.out.println("choose the column to play (1-3): ");
				column = scan.nextInt();
				if(column >=1 && column<=3) {
					validColumn = true;
				}else {
					System.out.println("Invalid column! Try again");
				}
			}
			line--; // subtracting 1 of both because the array starts at position 0 not 1
			column--;
			if(ticTacToe[line][column] == 'X' || ticTacToe[line][column] == 'O') {
				System.out.println("Slot already used");
			}else {
				ticTacToe[line][column] = sign; // valid play
				play++;
			} // print the table of the game
			for(int i =0 ; i < ticTacToe.length; i++) {
				for(int j =0 ; j < ticTacToe[i].length; j++) {
					System.out.print(ticTacToe[i][j] + " | ");
				}
				System.out.println();
			}
			//check if have a winner
			if((ticTacToe[0][0] == 'X' && ticTacToe[0][1] == 'X' && ticTacToe[0][2] == 'X')||      // win line 1
					(ticTacToe[1][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][2] == 'X')|| //win line 2
					(ticTacToe[2][0] == 'X' && ticTacToe[2][1] == 'X' && ticTacToe[2][2] == 'X')|| // win line 3
					(ticTacToe[0][0] == 'X' && ticTacToe[1][0] == 'X' && ticTacToe[2][0] == 'X')|| //win column 1
					(ticTacToe[0][1] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][1] == 'X')|| //win column 2
					(ticTacToe[0][2] == 'X' && ticTacToe[1][2] == 'X' && ticTacToe[2][2] == 'X')|| //win column 3
					(ticTacToe[0][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][2] == 'X')|| // win main diagonal
					(ticTacToe[0][2] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][0] == 'X')) {// win sub diagonal
				win = true;
				System.out.println("PLAYER 1 WINS!");
				
			}else if((ticTacToe[0][0] == 'O' && ticTacToe[0][1] == 'O' && ticTacToe[0][2] == 'O')||// win line 1
					(ticTacToe[1][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][2] == 'O')|| //win line 2
					(ticTacToe[2][0] == 'O' && ticTacToe[2][1] == 'O' && ticTacToe[2][2] == 'O')|| // win line 3
					(ticTacToe[0][0] == 'O' && ticTacToe[1][0] == 'O' && ticTacToe[2][0] == 'O')|| //win column 1
					(ticTacToe[0][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][1] == 'O')|| //win column 2
					(ticTacToe[0][2] == 'O' && ticTacToe[1][2] == 'O' && ticTacToe[2][2] == 'O')|| //win column 3
					(ticTacToe[0][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][2] == 'O')|| // win main diagonal
					(ticTacToe[0][2] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][0] == 'O')){ // win sub diagonal
					win = true;
					System.out.println("PLAYER 2 WINS!");			
			}else if(play > 9) {
					win = true;
					System.out.println("Game tied!");
			}
		}
	}
}
