package com.example.dipansh.asobimasu.chess.pieces;

import java.util.ArrayList;
import com.example.dipansh.asobimasu.chess.data.Coordinates;
import com.example.dipansh.asobimasu.chess.data.Position;

/**
 * Created by dipansh on 1/12/17.
 */

public interface Movable {
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board);
}
