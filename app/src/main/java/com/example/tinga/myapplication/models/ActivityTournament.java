package com.example.tinga.myapplication.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tinga.myapplication.R;
import com.example.tinga.myapplication.helper.TournamentAdapter;
import com.example.tinga.myapplication.helper.Tournaments;

import java.util.ArrayList;

public class ActivityTournament extends AppCompatActivity {

    ListView simpleList;
    ArrayList<Tournaments> tournamentList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament);

        simpleList = (ListView) findViewById(R.id.list);
        tournamentList.add(new Tournaments("Lion", "Larger"));
        tournamentList.add(new Tournaments("Tiger", "Liger"));
        tournamentList.add(new Tournaments("Monkey", "Elephant"));
        tournamentList.add(new Tournaments("Elephant", "Monkey"));
        tournamentList.add(new Tournaments("Dog", "Cat"));
        tournamentList.add(new Tournaments("Cat", "Dog"));

        TournamentAdapter myAdapter=new TournamentAdapter(this,tournamentList);
        simpleList.setAdapter(myAdapter);


    }

}
