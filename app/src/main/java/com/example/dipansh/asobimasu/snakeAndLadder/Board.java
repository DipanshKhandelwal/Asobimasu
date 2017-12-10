package com.example.dipansh.asobimasu.snakeAndLadder;

/**
 * Created by lenovo on 09-12-2017.
 */

public class Board {
    public Board(){}
    Block b_obj=new Block();
    Block[] SL_board=new Block[101];
    public void createBoard(){
        for(int i=0;i<101;i++){
            SL_board[i]=new Block();
        }
        for(int i=0;i<=100;i++){
            b_obj.setBlock_id(SL_board[i],i);
            b_obj.setJumpPos(SL_board[i],i);
        }
        // Setting jump positions for those blocks which have ladders climbing up.
        b_obj.setValue(SL_board[5],1);
        b_obj.setJumpPos(SL_board[5],25);
        b_obj.setValue(SL_board[10],1);
        b_obj.setJumpPos(SL_board[10],29);
        b_obj.setValue(SL_board[22],1);
        b_obj.setJumpPos(SL_board[22],41);
        b_obj.setValue(SL_board[28],1);
        b_obj.setJumpPos(SL_board[28],55);
        b_obj.setValue(SL_board[44],1);
        b_obj.setJumpPos(SL_board[44],95);
        b_obj.setValue(SL_board[70],1);
        b_obj.setJumpPos(SL_board[70],89);
        b_obj.setValue(SL_board[79],1);
        b_obj.setJumpPos(SL_board[79],81);

        // Setting jump positions for blocks having snake faces.
        b_obj.setValue(SL_board[31],-1);
        b_obj.setJumpPos(SL_board[31],14);
        b_obj.setValue(SL_board[37],-1);
        b_obj.setJumpPos(SL_board[37],17);
        b_obj.setValue(SL_board[73],-1);
        b_obj.setJumpPos(SL_board[73],53);
        b_obj.setValue(SL_board[78],-1);
        b_obj.setJumpPos(SL_board[78],29);
        b_obj.setValue(SL_board[92],-1);
        b_obj.setJumpPos(SL_board[92],35);
        b_obj.setValue(SL_board[99],-1);
        b_obj.setJumpPos(SL_board[99],7);
    }
    Block[] getMyBlocks(Board b1){
        return b1.SL_board;
    }
    Block getBlock(Board b,int pos){
        return b.SL_board[pos];
    }
}
