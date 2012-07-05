package com.dthielke.tictactoe.console;

public class GameBoard {

    public enum Space {
        BLANK,
        X,
        O
    }

    public enum Status {
        ONGOING,
        DRAW,
        X_WON,
        O_WON
    }

    private Space board[][];

    public GameBoard() {
    	board = new Space[3][3];
    	clear();
    }

    public void clear() {
    	for (int x = 0; x < 3; ++x) {
    		for (int y = 0; y < 3; ++y) {
    			board[x][y] = Space.BLANK;
    		}
    	}
    }

    public void setSpace(int x, int y, Space type) {
    	board[x][y] = type;
    }

    public Space getSpace(int x, int y) {
        return board[x][y];
    }

    public Status getStatus() {
    	for (int x = 0; x < 3; ++x) {
    		if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
    			if (board[x][0] != Space.BLANK) {
    				if (board[x][0] == Space.X)
    					return Status.X_WON;
    				else
    					return Status.O_WON;
    			}
    		}
    	}
    	
    	for (int y = 0; y < 3; ++y) {
    		if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
    			if (board[0][y] != Space.BLANK) {
    				if (board[0][y] == Space.X)
    					return Status.X_WON;
    				else
    					return Status.O_WON;
    			}
    		}
    	}
    	
    	if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
    		if (board[0][0] != Space.BLANK) {
				if (board[0][0] == Space.X)
					return Status.X_WON;
				else
					return Status.O_WON;
			}
    	}
    	
    	if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
    		if (board[2][0] != Space.BLANK) {
				if (board[2][0] == Space.X)
					return Status.X_WON;
				else
					return Status.O_WON;
			}
    	}
    	
    	for (int x = 0; x < 3; ++x) {
    		for (int y = 0; y < 3; ++y) {
    			if (board[x][y] == Space.BLANK) {
    				return Status.ONGOING;
    			}
    		}
    	}

    	return Status.DRAW;
    }
    
}
