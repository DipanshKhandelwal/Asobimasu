package com.example.dipansh.asobimasu.connect4;

/**
 * Created by rachana on 12/12/2017.
 */

public class Board {

    public com.example.dipansh.asobimasu.connect4.Board.Turn turn;

    private int numCols;
    private int numRows;
    public boolean hasWinner;
    public Cell[][] cells;

    public enum Turn {
        FIRST, SECOND
    }

    public Board(int cols, int rows) {
        numCols = cols;
        numRows = rows;
        cells = new Cell[numCols][numRows];
        reset();
    }

    public void reset() {
        hasWinner = false;
        turn = Turn.FIRST;
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                cells [col][row] = new Cell();
            }
        }
    }

    public int lastAvailableRow(int col) {
        for (int row = numRows - 1; row >= 0; row--) {
            if (cells[col][row].empty) {
                return row;
            }
        }
        return -1;
    }

    public void occupyCell(int col, int row) {
        cells[col][row].setPlayer(turn);
    }

    public void toggleTurn() {
        if (turn == Turn.FIRST) {
            turn = Turn.SECOND;
        } else {
            turn = Turn.FIRST;
        }
    }

    public boolean checkForWin(int c, int r) {
        for (int col = 0; col < numCols; col++) {
            if (isContiguous(turn, 0, 1, col, 0, 0) || isContiguous(turn, 1, 1, col, 0, 0) || isContiguous(turn, -1, 1, col, 0, 0)) {
                hasWinner = true;
                return true;
            }
        }
        for (int row = 0; row < numRows; row++) {
            if (isContiguous(turn, 1, 0, 0, row, 0) || isContiguous(turn, 1, 1, 0, row, 0) || isContiguous(turn, -1, 1, numCols - 1, row, 0)) {
                hasWinner = true;
                return true;
            }
        }
        return false;
    }

    private boolean isContiguous(Turn player, int dirX, int dirY, int col, int row, int count) {
        if (count >= 4) {
            return true;
        }
        if (col < 0 || col >= numCols || row < 0 || row >= numRows) {
            return false;
        }
        Cell cell = cells[col][row];
        if (cell.player == player) {
            return isContiguous(player, dirX, dirY, col + dirX, row + dirY, count + 1);
        } else {
            return isContiguous(player, dirX, dirY, col + dirX, row + dirY, 0);
        }
    }

}


