package com.example.dipansh.asobimasu;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dipansh.asobimasu.chess.ChessMainActivity;
import com.example.dipansh.asobimasu.snakeAndLadder.SnakeAndLadderMainActivity;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton chess, snake_and_ladder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chess = (FloatingActionButton) findViewById(R.id.button_chess);
        snake_and_ladder = (FloatingActionButton) findViewById(R.id.button_snake_and_ladder);

        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chess = new Intent(MainActivity.this, ChessMainActivity.class);
                MainActivity.this.startActivity(chess);
            }
        });

        snake_and_ladder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chess = new Intent(MainActivity.this, SnakeAndLadderMainActivity.class);
                MainActivity.this.startActivity(chess);
            }
        });
    }
}
