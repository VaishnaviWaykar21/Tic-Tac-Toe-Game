// Task: Tic-Tac-Toe Game

package Level_2;

import java.util.Scanner;

public class Task_1{
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            Task_1_1.printBoard();
            Task_1_1.playerMove(scanner);

            if(Task_1_1.checkWinner()) {
                Task_1_1.printBoard();
                System.out.println("Player " + Task_1_1.currentPlayer + " wins!");
                break;
            }

            if(Task_1_1.isBoardFull()) {
                Task_1_1.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            Task_1_1.switchPlayer();
        }
        scanner.close();
    }

}