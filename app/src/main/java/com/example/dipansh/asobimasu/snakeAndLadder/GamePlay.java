package com.example.dipansh.asobimasu.snakeAndLadder;

import java.util.Random;

/**
 * This File has the main logic if you wanna see how the process is going just run this java file
 * This File is just for understanding Its important methods are reconstucted in SnakeAndLadderBoard.java
 * @author Rohit.
 */

public class GamePlay {
    Block[] board=new Block[101];
    Board gameBoard=new Board();
    public GamePlay(){
    }
    public int throwDice(){
        int count=0;
        int dice_no=0;
        Random r=new Random();
        dice_no=r.nextInt(5)+1;
        if(dice_no==6){
            count++;
            while(count<3){
                dice_no+=r.nextInt(5)+1;
                if(dice_no%6==0)
                    count++;
                else
                    break;
            }
            if(count==3){
                dice_no=0;
            }
        }
        return dice_no;
    }

    public void Play(int nop,int value){             // nop= num of players.
        gameBoard.createBoard();
        int position=0;
        Block z=new Block();
        z=gameBoard.getBlock(gameBoard,10);
        System.out.println("@@@@");
        System.out.println(z.getValue());
        int complete_num=0;     // it will store the number of players who have completed playing.
        Players[] plyr=new Players[nop];
        for(int i=0;i<nop;i++){
            plyr[i]=new Players();
        }
        int i=0;
        int j=1;
        while(complete_num<nop-1){
            j=1;
            for(j=1;j<=nop && complete_num!=nop-1;j++){
                if(!plyr[j-1].IsWinner()){
                    System.out.println("Player "+j);
                    int dice=throwDice();
                    System.out.println("Dice is "+dice);
                    System.out.println(plyr[j-1].get_pos());
                    if(plyr[j-1].get_pos()+dice<=100)
                        plyr[j-1].update_pos(plyr[j-1].get_pos()+dice);
                    System.out.println(plyr[j-1].get_pos());
                    Block target=gameBoard.getBlock(gameBoard,plyr[j-1].get_pos());
                    if(target.getValue()!=0 ){
                        plyr[j-1].update_pos(target.getJump());
                        System.out.println("**"+plyr[j-1].get_pos());
                    }
                    if(plyr[j-1].get_pos()==100){
                        complete_num++;
                        plyr[j-1].setRank(complete_num);
                        plyr[j-1].set_win_stat(true);
                    }
                }
            }
        }
        if(complete_num==nop-1){
            plyr[j-2].setRank(complete_num);
        }
        for(i=0;i<nop;i++){
            if(!plyr[i].IsWinner()){
                plyr[i].setRank(nop);
            }
        }
        for(i=0;i<nop;i++){
            System.out.println("*******Player "+(i+1)+" ranks "+plyr[i].getRank());
        }
    }


}
