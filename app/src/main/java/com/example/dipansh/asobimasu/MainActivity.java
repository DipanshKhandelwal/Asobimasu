package com.example.dipansh.asobimasu;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dipansh.asobimasu.chess.ChessMainActivity;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton chess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chess = (FloatingActionButton) findViewById(R.id.button_chess);

        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chess = new Intent(MainActivity.this, ChessMainActivity.class);
                MainActivity.this.startActivity(chess);
            }
        });
    }
}
