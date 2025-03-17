package tictactoe;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Human extends Player {

    public Human(String name, Symbol symbol) {
        super(name, symbol);
    }
    
  
    public void getMove(Grid grid) {
        Scanner scanner = new Scanner(System.in);
       while(true) {
    	   System.out.println(name+", enter your move (e.g, A1,B3)");
    	   String input = scanner.nextLine().trim().toUpperCase();
    	   if(input.length()!=2) {
    		   System.out.println("Ivalid imput! try again (Enter a letter between A to C and number between 1 to 3).");
    		   continue;
    	   }
    	   char rowChar = input.charAt(0);
    	   char colInt = input.charAt(1);
    	   
    	   if(rowChar < 'A'||rowChar>'C'||colInt<'1'||colInt>'3') {
    		   System.out.println("Ivalid imput! try again (Enter a letter between A to C and number between 1 to 3).");
    	   continue;
    	   }
    	   
    	   int row = rowChar - 'A'; // 'A'->0,'B'->1,'C'->2
    	   int column = colInt - '1';  // '1'->0,'2'->1,'3'->2
    	   
    	   if (grid.isValidMove(row, column)) {
    		   grid.placeSymbol(row, column, symbol);
    		   break;
    	   }
    	   else {System.out.println("Invalid move, try again.");
    			   }
       }
    }
}