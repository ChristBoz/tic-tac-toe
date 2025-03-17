# tic-tac-toe
## Overview
This app is a simple text based game using OOP (Object Oriented Design) and implemented in java and has many features.
## Feautres
- **Object Oriented Design:** This app uses OOD concepts such as encapsulation, inheritance and composition.
- **2 game modes:** This game has 2 different game modes which are Player vs Computer and Player vs Player.
- **Grid display:** The board is always dislayed after every move.
- **Win detection:** The game checks for a winner after every move.
- **Tie detection:** The game checks if all the squares all full, and if they are then it's a tie.
- **Replay:** The player can replay the game if he wants to.


## How to Play
1. Run the program.
2. Choose the game mode:
  - '1' Player vs computer.
  - '2' Player vs Player.
3. Enter Player Name (for Player vs Computer) and Player Names (for Player vs Player).
4. Take turns entering each move:
  - Humans enter their moves using the  format A1,B2,C3...
  - Computer seelcts random valid moves.
5. The game displays the board after every move.
6. The game ends when a Player wins or the game ends in a draw.
7. The player can replay the game if he wants to.

## Classes and Design
### **1. 'Main'**
- The entry point for the game.
- Handles: game mode selection, turn management and win conditions.

### **2. 'Player' (Abstract)**
- Superclass that is the bas class for 'Human' and 'Computer'.
- Stores PLayer's name and symbol.

### **3. 'Human' (Extends 'Player')**
- Reads **user input** for moves.
- Ensures valid move entry.

### **4. 'Computer' (Extends 'Player')**
- Randomly selects valid moves.

### **5. 'Grid'**
- Manages the board
- Checks for valid moves, win conditions and full board detection.
- Dsiplays the grid.

### **6. 'Square'**
- Represents one single cell on the board
- Stores a symbol


### **7. 'Symbol'**
* Encapsulates a game piece.


