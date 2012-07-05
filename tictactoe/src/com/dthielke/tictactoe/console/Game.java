package com.dthielke.tictactoe.console;

import java.util.Scanner;

import com.dthielke.tictactoe.console.GameBoard.Space;
import com.dthielke.tictactoe.console.GameBoard.Status;

public class Game {

    private GameBoard board; // keeps track of the player's moves and the game's status
    private boolean xTurn; // true if it's X's turn, false if it's O's turn

    public Game() {
    	board = new GameBoard();
    	xTurn = true;
    }

    public void printBoard() {
    	for (int y = 0; y < 3; ++y) {
    		System.out.println("+-+-+-+");
    		for (int x = 0; x < 3; ++x) {
    			System.out.print("|");
    			switch (board.getSpace(x, y)) {
    			case BLANK: System.out.print(" ");
    				break;
    			case X: System.out.print("X");
    				break;
    			case O: System.out.print("O");
    				break;
    			}
    		}
    		System.out.println("|");
    	}
    	System.out.println("+-+-+-+");
    }

    public void runGame() {
    	Status status = Status.ONGOING;
    	
    	printResult();
    	while (status == Status.ONGOING) {
    		printBoard();
        	promptMove();
        	status = printResult();
    	}
    	printBoard();
        System.out.println("GG (Hit enter to exit)");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    public void promptMove() {
    	System.out.println("Enter an (x,y) coordinate for your next move (0,0) -> (2,2)");
    	Scanner scan = new Scanner(System.in);
    	scan.useDelimiter("[,()]? *");
    	
    	int x = scan.nextInt();
    	int y = scan.nextInt();
    	
    	if (x > 2 || x < 0 || y > 2 || y < 0 || board.getSpace(x,y) != Space.BLANK) {
    		System.out.println("Invalid coordinates");
    		promptMove();
    	}
    	else
    	{
    		board.setSpace(x,y, xTurn ? Space.X : Space.O);
    		xTurn = !xTurn;
    	}
    }

    public Status printResult() {
    	String result = "";
    	Status status =  board.getStatus();
    	
    	switch (status) {
    	case DRAW: result = "The game has come to a draw.";
    		break;
    	case O_WON: result = "O has won the game.";
    		break;
    	case ONGOING: result = "Play on" + (xTurn ? "; X's turn" : "; O's turn");
    		break;
    	case X_WON: result = "X has won the game.";
    		break;
    	}
    	
    	System.out.println(result);
    	return status;
    }

    public static void main(String[] args) {
    	Game game = new Game();
    	game.runGame();
    }
    
    //corn

}
