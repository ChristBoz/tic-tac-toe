package tictactoe;

import java.util.Random;

class Computer extends Player {
    private Random random;

    public Computer(String name, Symbol symbol) {
        super(name, symbol);
        this.random = new Random();
    }

  //method for the computer to make a move
    public void getMove(Grid grid) {
       Random rand = new Random();
       int row;
       int column;
       
       while(true) {
    	   //generate random row and column values
    	   row = rand.nextInt(3);
    	   column = rand.nextInt(3);
    	   //check if the move is valid to place the symbol
    	   if (grid.isValidMove(row, column)) {
    		   grid.placeSymbol(row, column, symbol);
               char rowChar = (char)('A' + row); //convert row index to char to get A B or C
               int columnDigit = column + 1; //add one to the column index to get 1 2 or 3
    		  System.out.println("Computer played at ("+rowChar+","+columnDigit+")");
    		  break;
    	   }
    	   }
       }
}