package com.example.dipansh.asobimasu.chess.pieces;

import com.example.dipansh.asobimasu.chess.data.Coordinates;
import com.example.dipansh.asobimasu.chess.data.Position;

import java.util.ArrayList;

/**
 * Created by DIPANSH KHANDELWAL on 03-06-2017
 */

public class Piece implements Movable{

    private boolean white;

    public Piece(boolean white) {
        this.white = white;
    }



    public boolean isWhite() {
        return white;
    }

    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                c = new Coordinates(i,j);
                allowedMoves.add(c);
            }
        }
        return allowedMoves;
    }
}
