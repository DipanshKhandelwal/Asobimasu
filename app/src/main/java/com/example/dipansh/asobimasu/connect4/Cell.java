package com.example.dipansh.asobimasu.connect4;

/**
 * Created by rachana on 12/12/2017.
 */

public class Cell {
    public boolean empty;
    public  com.example.user.connect4.Board.Turn player;

    public Cell() {
        empty = true;
    }

    public void setPlayer(com.example.user.connect4.Board.Turn player) {
        this.player = player;
        empty = false;
    }
}