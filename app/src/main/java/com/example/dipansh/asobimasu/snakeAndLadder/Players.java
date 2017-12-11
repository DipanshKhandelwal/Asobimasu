package com.example.dipansh.asobimasu.snakeAndLadder;

/**
 * Created by lenovo on 09-12-2017.
 */

public class Players {

    private int player_pos;
    private boolean win_stat;
    private int rank;
    public Players(){
        player_pos=0;
        win_stat=false;
        rank=0;
    }
    public int get_pos(){
        return this.player_pos;
    }
    public void update_pos(int pos){
        this.player_pos=pos;
    }
    public boolean IsWinner(){
        return this.win_stat;
    }
    public int getRank(){
        return this.rank;
    }
    public void setRank(int i){
        this.rank=i;
    }
    public void set_win_stat(boolean ws){
        this.win_stat=ws;
    }
}

