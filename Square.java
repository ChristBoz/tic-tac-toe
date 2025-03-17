package tictactoe;

/** 
 * This class Square is a single cell in the grid, a square can hold the symbols X,O or holds nothing (empty).
 */

class Square {
    private Symbol symbol;

    public Square() {
        this.symbol = new Symbol(' ');
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
    public boolean isEmpty() {
    	return symbol.getSymbol() == ' '; //returns true if the square is empty.
    }
}
