package com.example.tinga.myapplication.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tinga.myapplication.R;
import com.example.tinga.myapplication.helper.Tournaments;

import java.util.ArrayList;

/**
 * Created by Tinga on 2016/12/12.
 */
public class TournamentAdapter extends ArrayAdapter<Tournaments>{



        ArrayList<Tournaments> tournmentlList = new ArrayList<>();

        public TournamentAdapter(Context context, ArrayList<Tournaments> objects) {
            super(context, 0, objects);
            tournmentlList = objects;
        }

        @Override
        public int getCount() {
            return super.getCount();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View v = convertView;
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.activity_tournament, null);
            TextView name = (TextView) v.findViewById(R.id.tournament_name);
            TextView date = (TextView) v.findViewById(R.id.tournament_date);
            name.setText(tournmentlList.get(position).getName());
            date.setText(tournmentlList.get(position).getDate());
            return v;

        }

    }


//    public TournamentAdapter(Context context, ArrayList<Tournaments> tournament) {
//        super(context, 0, tournament);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View listView = convertView;
//        if (listView == null){
//            listView = LayoutInflater.from(getContext()).inflate(R.layout.activity_tournament, parent, false);
//        }
//
//        Tournaments currentTournaments = getItem(position);
//
//        TextView titleTextView = (TextView) listView.findViewById(R.id.tournament_name);
//        titleTextView.setText(currentTournaments.getName());
//
//        TextView dateTextView = (TextView) listView.findViewById(R.id.tournament_date);
//        dateTextView.setText(currentTournaments.getDate());
//
//        return listView;
//    }

