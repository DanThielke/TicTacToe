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
        // TODO: initialize the board
    }

    public void clear() {
        // TODO: clears the board (fills it with BoardSpace.BLANK)
    }

    public void setSpace(int x, int y, Space type) {
        // TODO: sets the space type at (x,y)
    }

    public Space getSpace(int x, int y) {
        // TODO: returns the space type at (x,y)
        return Space.BLANK;
    }

    public Status getStatus() {
        // TODO: analyzes the board's spaces and returns the game's status
        return Status.ONGOING;
    }

}
