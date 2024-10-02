package Level_2;

import java.util.Scanner;

public class Task_1_1 {
	
	 public static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	 public static char currentPlayer = 'X';

	public static void printBoard() {
        for(int i = 0; i < 9; i++) {
            System.out.print(" " + board[i]);
            if(i % 3 != 2) {
                System.out.print(" |");
            } else if(i < 8) {
                System.out.println("\n---|---|---");
            }
        }
        System.out.println();
    }
	
	public static void playerMove(Scanner scanner) {
        int move;
        while(true) {
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            move = scanner.nextInt() - 1;

            if(move >= 0 && move < 9 && board[move] == ' ') {
                board[move] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
	
	
	public static boolean checkWinner() {
        // Check rows
        for(int i = 0; i < 9; i += 3) {
            if (board[i] == currentPlayer && board[i + 1] == currentPlayer && board[i + 2] == currentPlayer) {
                return true;
            }
        }
        // Check columns
        for(int i = 0; i < 3; i++) {
            if (board[i] == currentPlayer && board[i + 3] == currentPlayer && board[i + 6] == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if((board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
            (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer)) {
            return true;
        }

        return false;
    }
	
	
	 public static boolean isBoardFull() {
	        for(int i = 0; i < 9; i++) {
	            if(board[i] == ' ') {
	                return false;
	            }
	        }
	        return true;
	    }

	 
	 public static void switchPlayer() {
	        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	    }
}
