package com.example.dipansh.asobimasu.snakeAndLadder;

import com.example.dipansh.asobimasu.R;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.dipansh.asobimasu.R;

public class SnakeAndLadderMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_and_ladder_main);
        RelativeLayout image = (RelativeLayout) findViewById(R.id.start_page);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent board = new Intent(SnakeAndLadderMainActivity.this, SnakeAndLadderBoard.class);
                startActivity(board);
            }
        });
    }
}
