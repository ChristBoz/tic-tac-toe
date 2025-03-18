package tictactoe;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Human extends Player {

    public Human(String name, Symbol symbol) {
        super(name, symbol);
    }
    
  
    public void getMove(Grid grid) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(name + ", enter your move (e.g., A1, B3)");
            String input = scanner.nextLine().toUpperCase();

            if (input.length() != 2) {
                System.out.println("Invalid input! Try again (Enter a letter A-C and a number 1-3).");
                continue;
            }

            char colChar = input.charAt(0); // First char is column (A, B, C)
            char rowChar = input.charAt(1); // Second char is row (1, 2, 3)

            if (colChar < 'A' || colChar > 'C' || rowChar < '1' || rowChar > '3') {
                System.out.println("Invalid input! Try again (Enter a letter A-C and a number 1-3).");
                continue;
            }

            int column = colChar - 'A'; // A -> 0, B -> 1, C -> 2
            int row = rowChar - '1';    // 1 -> 0, 2 -> 1, 3 -> 2

            if (grid.isValidMove(column, row)) { // Swapped row & column
                grid.placeSymbol(column, row, symbol); // Swapped row & column
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

}
