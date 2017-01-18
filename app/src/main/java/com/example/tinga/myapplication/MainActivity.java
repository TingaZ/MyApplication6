package com.example.tinga.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tinga.myapplication.models.ActivityGames;
import com.example.tinga.myapplication.models.ActivityTournament;

public class MainActivity extends AppCompatActivity {

    TextView tvGames, tvTournaments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGames = (TextView) findViewById(R.id.tvGames);
        tvTournaments = (TextView) findViewById(R.id.tvTournaments);

        tvGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, ActivityGames.class));

            }
        });

        tvTournaments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityTournament.class));
            }
        });

    }
}
