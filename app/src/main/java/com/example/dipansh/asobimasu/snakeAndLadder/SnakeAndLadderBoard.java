package com.example.dipansh.asobimasu.snakeAndLadder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.dipansh.asobimasu.R;

import java.util.Random;

public class SnakeAndLadderBoard extends AppCompatActivity {

    int count = 0;
    int countP1 = 0;
    int countP2 = 0;
    int posP1 = 0;
    int posP2 = 0;
    int numberOfPlayers = 2;
    int complete_num = 0;     // it will store the number of players who have completed playing.
    boolean startPlayer1 = false;
    boolean startPlayer2 = false;

    Players[] plyr = new Players[numberOfPlayers];

    Block[] board = new Block[101];
    Board gameBoard = new Board();

    public TextView[][] DisplayBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_and_ladder_board);

        gameBoard.createBoard();
        for(int i=0;i<numberOfPlayers;i++){
            plyr[i]=new Players();
        }

        DisplayBoard = new TextView[10][10];
        initializeBoard();
    }


    private void initializeBoard(){

        count = 0;
        countP1 = 0 ;
        countP2 = 0;
        posP1 = -1;
        posP2 = -2;
        numberOfPlayers = 2;
        complete_num = 0;
        startPlayer1 = false;
        startPlayer2 = false;

        DisplayBoard[0][0] = (TextView) findViewById(R.id.g1);
        DisplayBoard[0][1] = (TextView) findViewById(R.id.g2);
        DisplayBoard[0][2] = (TextView) findViewById(R.id.g3);
        DisplayBoard[0][3] = (TextView) findViewById(R.id.g4);
        DisplayBoard[0][4] = (TextView) findViewById(R.id.g5);
        DisplayBoard[0][5] = (TextView) findViewById(R.id.g6);
        DisplayBoard[0][6] = (TextView) findViewById(R.id.g7);
        DisplayBoard[0][7] = (TextView) findViewById(R.id.g8);
        DisplayBoard[0][8] = (TextView) findViewById(R.id.g9);
        DisplayBoard[0][9] = (TextView) findViewById(R.id.g10);

        DisplayBoard[1][0] = (TextView) findViewById(R.id.g11);
        DisplayBoard[1][1] = (TextView) findViewById(R.id.g12);
        DisplayBoard[1][2] = (TextView) findViewById(R.id.g13);
        DisplayBoard[1][3] = (TextView) findViewById(R.id.g14);
        DisplayBoard[1][4] = (TextView) findViewById(R.id.g15);
        DisplayBoard[1][5] = (TextView) findViewById(R.id.g16);
        DisplayBoard[1][6] = (TextView) findViewById(R.id.g17);
        DisplayBoard[1][7] = (TextView) findViewById(R.id.g18);
        DisplayBoard[1][8] = (TextView) findViewById(R.id.g19);
        DisplayBoard[1][9] = (TextView) findViewById(R.id.g20);

        DisplayBoard[2][0] = (TextView) findViewById(R.id.g21);
        DisplayBoard[2][1] = (TextView) findViewById(R.id.g22);
        DisplayBoard[2][2] = (TextView) findViewById(R.id.g23);
        DisplayBoard[2][3] = (TextView) findViewById(R.id.g24);
        DisplayBoard[2][4] = (TextView) findViewById(R.id.g25);
        DisplayBoard[2][5] = (TextView) findViewById(R.id.g26);
        DisplayBoard[2][6] = (TextView) findViewById(R.id.g27);
        DisplayBoard[2][7] = (TextView) findViewById(R.id.g28);
        DisplayBoard[2][8] = (TextView) findViewById(R.id.g29);
        DisplayBoard[2][9] = (TextView) findViewById(R.id.g30);

        DisplayBoard[3][0] = (TextView) findViewById(R.id.g31);
        DisplayBoard[3][1] = (TextView) findViewById(R.id.g22);
        DisplayBoard[3][2] = (TextView) findViewById(R.id.g33);
        DisplayBoard[3][3] = (TextView) findViewById(R.id.g34);
        DisplayBoard[3][4] = (TextView) findViewById(R.id.g35);
        DisplayBoard[3][5] = (TextView) findViewById(R.id.g36);
        DisplayBoard[3][6] = (TextView) findViewById(R.id.g37);
        DisplayBoard[3][7] = (TextView) findViewById(R.id.g38);
        DisplayBoard[3][8] = (TextView) findViewById(R.id.g39);
        DisplayBoard[3][9] = (TextView) findViewById(R.id.g40);

        DisplayBoard[4][0] = (TextView) findViewById(R.id.g41);
        DisplayBoard[4][1] = (TextView) findViewById(R.id.g42);
        DisplayBoard[4][2] = (TextView) findViewById(R.id.g43);
        DisplayBoard[4][3] = (TextView) findViewById(R.id.g44);
        DisplayBoard[4][4] = (TextView) findViewById(R.id.g45);
        DisplayBoard[4][5] = (TextView) findViewById(R.id.g46);
        DisplayBoard[4][6] = (TextView) findViewById(R.id.g47);
        DisplayBoard[4][7] = (TextView) findViewById(R.id.g48);
        DisplayBoard[4][8] = (TextView) findViewById(R.id.g49);
        DisplayBoard[4][9] = (TextView) findViewById(R.id.g50);

        DisplayBoard[5][0] = (TextView) findViewById(R.id.g51);
        DisplayBoard[5][1] = (TextView) findViewById(R.id.g52);
        DisplayBoard[5][2] = (TextView) findViewById(R.id.g53);
        DisplayBoard[5][3] = (TextView) findViewById(R.id.g54);
        DisplayBoard[5][4] = (TextView) findViewById(R.id.g55);
        DisplayBoard[5][5] = (TextView) findViewById(R.id.g56);
        DisplayBoard[5][6] = (TextView) findViewById(R.id.g57);
        DisplayBoard[5][7] = (TextView) findViewById(R.id.g58);
        DisplayBoard[5][8] = (TextView) findViewById(R.id.g59);
        DisplayBoard[5][9] = (TextView) findViewById(R.id.g60);

        DisplayBoard[6][0] = (TextView) findViewById(R.id.g61);
        DisplayBoard[6][1] = (TextView) findViewById(R.id.g62);
        DisplayBoard[6][2] = (TextView) findViewById(R.id.g63);
        DisplayBoard[6][3] = (TextView) findViewById(R.id.g64);
        DisplayBoard[6][4] = (TextView) findViewById(R.id.g65);
        DisplayBoard[6][5] = (TextView) findViewById(R.id.g66);
        DisplayBoard[6][6] = (TextView) findViewById(R.id.g67);
        DisplayBoard[6][7] = (TextView) findViewById(R.id.g68);
        DisplayBoard[6][8] = (TextView) findViewById(R.id.g69);
        DisplayBoard[6][9] = (TextView) findViewById(R.id.g70);

        DisplayBoard[7][0] = (TextView) findViewById(R.id.g71);
        DisplayBoard[7][1] = (TextView) findViewById(R.id.g72);
        DisplayBoard[7][2] = (TextView) findViewById(R.id.g73);
        DisplayBoard[7][3] = (TextView) findViewById(R.id.g74);
        DisplayBoard[7][4] = (TextView) findViewById(R.id.g75);
        DisplayBoard[7][5] = (TextView) findViewById(R.id.g76);
        DisplayBoard[7][6] = (TextView) findViewById(R.id.g77);
        DisplayBoard[7][7] = (TextView) findViewById(R.id.g78);
        DisplayBoard[7][8] = (TextView) findViewById(R.id.g79);
        DisplayBoard[7][9] = (TextView) findViewById(R.id.g80);

        DisplayBoard[8][0] = (TextView) findViewById(R.id.g81);
        DisplayBoard[8][1] = (TextView) findViewById(R.id.g82);
        DisplayBoard[8][2] = (TextView) findViewById(R.id.g83);
        DisplayBoard[8][3] = (TextView) findViewById(R.id.g84);
        DisplayBoard[8][4] = (TextView) findViewById(R.id.g85);
        DisplayBoard[8][5] = (TextView) findViewById(R.id.g86);
        DisplayBoard[8][6] = (TextView) findViewById(R.id.g87);
        DisplayBoard[8][7] = (TextView) findViewById(R.id.g88);
        DisplayBoard[8][8] = (TextView) findViewById(R.id.g89);
        DisplayBoard[8][9] = (TextView) findViewById(R.id.g90);

        DisplayBoard[9][0] = (TextView) findViewById(R.id.g91);
        DisplayBoard[9][1] = (TextView) findViewById(R.id.g92);
        DisplayBoard[9][2] = (TextView) findViewById(R.id.g93);
        DisplayBoard[9][3] = (TextView) findViewById(R.id.g94);
        DisplayBoard[9][4] = (TextView) findViewById(R.id.g95);
        DisplayBoard[9][5] = (TextView) findViewById(R.id.g96);
        DisplayBoard[9][6] = (TextView) findViewById(R.id.g97);
        DisplayBoard[9][7] = (TextView) findViewById(R.id.g98);
        DisplayBoard[9][8] = (TextView) findViewById(R.id.g99);
        DisplayBoard[9][9] = (TextView) findViewById(R.id.g100);

    }

    public void diceRoll(View view){

        int playerPosition = 0;

        if(posP1 == 100 || posP2 == 100){
            Intent lastPage = new Intent(SnakeAndLadderBoard.this,SnakeAndLadderLastPage.class);
            startActivity(lastPage);
        }
        int value=throwDice();

        int n = count % numberOfPlayers +1;

        playerPosition = Play(2,value);
        if(n==1){
            //if(startPlayer1) {
            movePlayer1(playerPosition, posP1);
            posP1 = playerPosition;
            //}
        }

        else {
            movePlayer2(playerPosition, posP2);
            posP2 = playerPosition;
        }

        if(value!=6) {
            count++;
        }

    }

    /**
     * This method finds the value of the dice roll
     * @return value of the dice roll
     */
    public int throwDice(){
        int dice_no=0;
        Random r=new Random();
        dice_no=r.nextInt(6)+1;
        if(count%2==0) {
            displayPlayer1(dice_no);
            countP1++;
        }
        else {
            displayPlayer2(dice_no);
            countP2++;
        }

        displayPlayerTurn();
        return dice_no;
    }

    private void displayPlayer1(int number) {
        TextView onDiceRoll = (TextView) findViewById(R.id.player1_onRoll);
        onDiceRoll.setText(String.valueOf(number));
    }

    private void displayPlayer2(int number) {
        TextView onDiceRoll = (TextView) findViewById(R.id.player2_onRoll);
        onDiceRoll.setText(String.valueOf(number));
    }

    private void displayPlayerTurn(){
        TextView playerTurn = (TextView)findViewById(R.id.player_turn_text_view);
        if(count%2==0)
            playerTurn.setText("Player 2's Turn");
        else
            playerTurn.setText("Player 1's Turn");
    }

    private void movePlayer1(int position,int positionOfPlayer1){
        int i = 0, j = 0;
        int x = 0, y = 0;

        //For moving player 1 to new position
        if(position > 10 && position % 10 != 0){
            i = position/10;
            j = (position%10) -1;
        }
        else if(position==0){
            i=0;
            j=0;
        }
        else if(position % 10 == 0){
            i = (position/10) - 1;
            j = 9;
        }
        else if(position < 10){
            i = 0;
            j = position-1;
        }

        //For removing image of player1 from previous position
        if(positionOfPlayer1 < 0){
            x=0;
            y=0;
        }
        else if(positionOfPlayer1 > 10 && positionOfPlayer1 % 10 != 0){
            x = positionOfPlayer1/10;
            y = (positionOfPlayer1%10) -1;
        }
        else if(positionOfPlayer1 == 0){
            x=0;
            y=0;
        }
        else if(positionOfPlayer1 % 10 == 0){
            x = (positionOfPlayer1/10) - 1;
            y = 9;
        }
        else if(positionOfPlayer1 < 10){
            x = 0;
            y = positionOfPlayer1 - 1;
        }

        //Removing player1's Image from previous position
        DisplayBoard[x][y].setBackgroundResource(0);

        //displaying player1 in new position
        if(position != posP2)
            DisplayBoard[i][j].setBackgroundResource(R.drawable.snake_and_ladder_player1);
        else
            DisplayBoard[i][j].setBackgroundResource(R.drawable.snake_and_ladder_players);

    }

    private void movePlayer2(int position, int positionOfPlayer2){

        int i = 0, j = 0;
        int x = 0, y = 0;

        //For moving player2 to new position
        if(position > 10 && position % 10 != 0){
            i = position/10;
            j = (position%10) -1;
        }
        else if(position==0){
            i = 0;
            j = 0;
        }
        else if(position % 10 == 0){
            i = (position/10) - 1;
            j=9;
        }
        else if(position < 10){
            i=0;
            j=position-1;
        }

        //For removing image of player2 from previous position
        if(positionOfPlayer2 < 0){
            x=0;
            y=0;
        }
        else if(positionOfPlayer2 > 10 && positionOfPlayer2 % 10 != 0){
            x = positionOfPlayer2/10;
            y = (positionOfPlayer2%10) -1;
        }
        else if(positionOfPlayer2 == 0){
            x=0;
            y=0;
        }
        else if(positionOfPlayer2 % 10 == 0){
            x = (positionOfPlayer2/10) - 1;
            y = 9;
        }
        else if(positionOfPlayer2 < 10){
            x = 0;
            y = positionOfPlayer2 - 1;
        }

        //Removing player2's Image from previous position
        DisplayBoard[x][y].setBackgroundResource(0);

        //displaying player2 in new position
        if(posP1!=position)
            DisplayBoard[i][j].setBackgroundResource(R.drawable.snake_and_ladder_player2);

        else
            DisplayBoard[i][j].setBackgroundResource(R.drawable.snake_and_ladder_players);
    }



    /**
     * This method finds the Posion of player after a single dice roll
     * @param nop is player number
     * @param value is the value of the dice roll
     * @return posision after a single roll
     */
    public int Play(int nop,int value){

        int positionAfterRoll=0;                    //Position of specific player after 1 roll
        int j=1;                                    // Player Number
        if(complete_num<numberOfPlayers-1){
            j=count%nop +1;
            if(j<=numberOfPlayers && complete_num!=nop-1){
                if(!plyr[j-1].IsWinner()){
                    int dice=value;
                    if(plyr[j-1].get_pos()+dice<=100)
                        plyr[j-1].update_pos(plyr[j-1].get_pos()+dice);
                    positionAfterRoll=plyr[j-1].get_pos();
                    Block target=gameBoard.getBlock(gameBoard,plyr[j-1].get_pos());
                    if(target.getValue()!=0 ){
                        plyr[j-1].update_pos(target.getJump());
                        positionAfterRoll=plyr[j-1].get_pos();
                    }
                    if(plyr[j-1].get_pos()==100){
                        complete_num++;
                        plyr[j-1].setRank(complete_num);
                        plyr[j-1].set_win_stat(true);
                    }
                }
            }
        }

        if(!plyr[j-1].IsWinner()){
            plyr[j-1].setRank(nop);
        }

        return positionAfterRoll;

    }

}
