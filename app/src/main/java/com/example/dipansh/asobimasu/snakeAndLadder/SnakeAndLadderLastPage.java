package com.example.dipansh.asobimasu.snakeAndLadder;

import com.example.dipansh.asobimasu.R;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SnakeAndLadderLastPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_and_ladder_last_page);
    }

    public void onClickReplay(View view){
        Intent replay = new Intent(SnakeAndLadderLastPage.this,SnakeAndLadderBoard.class);
        startActivity(replay);
    }

}
