package com.example.dipansh.asobimasu.snakeAndLadder;

/**
 * Created by lenovo on 09-12-2017.
 */

public class Block {
    public Block(){
        block_id=0;
        block_value=0;
        jump_pos=0;
    }
    void setBlock_id(Block b,int i){
        b.block_id=i;
    }
    void setValue(Block b,int i){
        b.block_value=i;
    }
    void setJumpPos(Block b,int i){
        b.jump_pos=i;
    }
    int getValue(){
        return this.block_value;
    }
    int getJump(){
        return this.jump_pos;
    }
    int get_id(){
        return this.block_id;
    }
    private int block_id;
    private int block_value;
    private int jump_pos;
}
