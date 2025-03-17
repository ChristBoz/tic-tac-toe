package tictactoe;
/** 
 * This class "Symbol" represents a game piece (either X or O) in tictactoe.
 */
class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
    	this.symbol=symbol;
    }
}
