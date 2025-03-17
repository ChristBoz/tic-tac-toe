package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1, player2;

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Choose Game Mode:");
        System.out.println("1: Player vs Computer");
        System.out.println("2: Player vs Player");

        int choice = 0;
        while (true) {
            try {
                System.out.print("Enter 1 or 2: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        // For both game modes, ask for Player 1's name.
        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine();
        Symbol symbolX = new Symbol('X');
        Symbol symbolO = new Symbol('O');

        player1 = new Human(name1, symbolX);

        if (choice == 1) {
            // Player vs Computer mode.
            player2 = new Computer("Computer", symbolO);
        } else {
            // Player vs Player mode.
            System.out.print("Enter Player 2 name: ");
            String name2 = scanner.nextLine();

            // If both names are the same, automatically adjust them.
            if (name1.equals(name2)) {
                name1 = name1 + "1";
                name2 = name2 + "2";
                System.out.println("Both players had the same name. Renaming to: "   
                                   + name1 + " and " + name2);
            }

            // Recreate player1 with updated name if necessary.
            player1 = new Human(name1, symbolX);
            player2 = new Human(name2, symbolO);
        }

        // Replay loop using a while loop.
        String playAgain = "Y";
        while (playAgain.equalsIgnoreCase("Y")) {
            Grid grid = new Grid();
            Player currentPlayer = player1;
            Player winner = null;

            // Main game loop.
            while (true) {
                grid.display();
                currentPlayer.getMove(grid);

                // Check if the current move won the game.
                if (grid.checkWin(currentPlayer.getSymbol())) {
                    winner = currentPlayer;
                    break;
                }

                // Check if the board is full.
                if (grid.isFull()) {
                    break;
                }

                // Switch turn.
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }            }

            grid.display();

            if (winner != null) {
                System.out.println("Congratulations " + winner.getName() + "! You win!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scanner.nextLine().trim();
        }
    }
}
