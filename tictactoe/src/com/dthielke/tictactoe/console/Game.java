package com.dthielke.tictactoe.console;

public class Game {

    private GameBoard board; // keeps track of the player's moves and the game's status
    private boolean xTurn; // true if it's X's turn, false if it's O's turn

    public Game() {
        // TODO: initializes member variables
    }

    public void printBoard() {
        // TODO: prints the board to the console
    }

    public void runGame() {
        // TODO: loops game by showing the board, asking a player for their move, and checking the board status
        // This method should interact with the board object, as well as the other methods of this class
    }

    public void promptMove() {
        // TODO: asks the current player for the (x,y) coordinates of their move and updates the board
        // Make sure to check if the move is valid and warn the player if it's not
    }

    public void printResult() {
        // TODO: prints the result of the game's end
    }

    public static void main(String[] args) {
        // TODO: creates a Game object and runs it
    	System.out.println("Corn");
    }

}
