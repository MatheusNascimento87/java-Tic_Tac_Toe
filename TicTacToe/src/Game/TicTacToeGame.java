package Game;

import java.util.Scanner;

public class TicTacToeGame {

	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        TicTacToe ticTacToe = new TicTacToe();

	        System.out.println("player 1 = X");
	        System.out.println("player 2 = O");

	        boolean won = false;
	        char sign;
	        int line = 0, column = 0;

	        while (!won) {

	            if (ticTacToe.player1Turn()) {

	                System.out.println("Player 1 turn 'X'. Choose line and column (1-3).");
	                sign = 'X';
	            } else {

	                System.out.println("Player 2 turn 'O'. Choose line and column (1-3).");
	                sign = 'O';
	            }

	            line = valor("Line", scan);
	            column = valor("Column", scan);
	            
	            if (!ticTacToe.validPlay(line, column, sign)){
	                System.out.println("Slot already used. Try again");
	            }
	            
	            ticTacToe.printTable();
	            
	            if (ticTacToe.checkWinner('X')){
	                won = true;
	                System.out.println("PLAYER 1 WINS!!");
	            } else if (ticTacToe.checkWinner('O')){
	            	won = true;
	                System.out.println("PLAYER 2 WINS!!");
	            } else if (ticTacToe.getPlay() > 9){
	                won = true;
	                System.out.println("Game tied!");
	            }
	        }
	    }

	    static int valor(String typeValue, Scanner scan) {
	        int value = 0;
	        boolean validValue = false;
	        while (!validValue) {
	            System.out.println("Enter the " + typeValue + " (1, 2 or 3)");
	            value = scan.nextInt();
	            if (value >= 1 && value <= 3) {
	                validValue = true;
	            } else {
	                System.out.println("Invalid input. Try again");
	            }
	        }
	        value--;
	        return value;
	    }
	}
