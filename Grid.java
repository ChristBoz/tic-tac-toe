
package tictactoe;

/**
 * This class "Grid" represents the board for a tictactoe game.
 * It manages the game state and checks for winners.
 */

public class Grid {
    private Square[][] board;
    /**
	A constructor that initializes a 3x3 grid with empty squares.
     */
    public Grid() {
        board = new Square[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = new Square();
            }
        }
    }


    public boolean isValidMove(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false; // Check bounds.
        }
        return board[row][column].isEmpty();  // Check if square is empty.
    }

    public void placeSymbol(int row, int column, Symbol symbol) {
        board[row][column].setSymbol(symbol);
    }

    public boolean checkWin(Symbol symbol) {
        char s = symbol.getSymbol();

        // Check rows.
        for (int i = 0; i < 3; i++){
            if (board[i][0].getSymbol().getSymbol() == s &&
                board[i][1].getSymbol().getSymbol() == s &&
                board[i][2].getSymbol().getSymbol() == s) {
                return true;
            }
        }

        // Check columns.
        for (int j = 0; j < 3; j++){
            if (board[0][j].getSymbol().getSymbol() == s &&
                board[1][j].getSymbol().getSymbol() == s &&
                board[2][j].getSymbol().getSymbol() == s) {
                return true;
            }
        }

        // Check diagonals.
        if (board[0][0].getSymbol().getSymbol() == s &&
            board[1][1].getSymbol().getSymbol() == s &&
            board[2][2].getSymbol().getSymbol() == s) {
            return true;
        }
        if (board[0][2].getSymbol().getSymbol() == s &&
            board[1][1].getSymbol().getSymbol() == s &&
            board[2][0].getSymbol().getSymbol() == s) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

 
   @Override
    public String toString() {
        String result = "\n  A   B   C\n"; // Column labels at the top.

        for (int i = 0; i < 3; i++) {
            result += (i + 1) + " "; // Row labels on the left.
            for (int j = 0; j < 3; j++) {
                result += board[j][i].getSymbol().getSymbol();
                if (j < 2) {
                    result += " | ";
                }
            }
            result += "\n";
            if (i < 2) {
                result += " ---+---+---\n";
            }
        }
        return result;
    }


    public void display() {
        System.out.println(this.toString()); // Display the grid.
    }

}
