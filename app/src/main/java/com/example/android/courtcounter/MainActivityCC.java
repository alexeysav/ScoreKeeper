package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityCC extends AppCompatActivity {
    // Tracks the score for Team A
    int scoreTeamA = 0;
    int yCardTeamA = 0;
    int rCardTeamA = 0;
    // Tracks the score for Team B
    int scoreTeamB = 0;
    int yCardTeamB = 0;
    int rCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cc);
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase number of yellow cards Team A by 1.
     */
    public void addYcardForTeamA(View v) {
        yCardTeamA = yCardTeamA + 1;
        displayYcardForTeamA(yCardTeamA);
    }
    /**
     * Increase number of red cards Team A by 1.
     */
    public void addRcardForTeamA(View v) {
        rCardTeamA = rCardTeamA + 1;
        displayRcardForTeamA(rCardTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays number of yellow cards for Team A.
     */
    public void displayYcardForTeamA(int score) {
        TextView cardView = (TextView) findViewById(R.id.yellowCardsA);
        cardView.setText(String.valueOf(score));
    }
    /**
     * Displays number of red cards for Team A.
     */
    public void displayRcardForTeamA(int score) {
        TextView cardView = (TextView) findViewById(R.id.redCardsA);
        cardView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase number of yellow cards Team B by 1.
     */
    public void addYcardForTeamB(View v) {
        yCardTeamB = yCardTeamB + 1;
        displayYcardForTeamB(yCardTeamB);
    }
    /**
     * Increase number of red cards Team B by 1.
     */
    public void addRcardForTeamB(View v) {
        rCardTeamB = rCardTeamB + 1;
        displayRcardForTeamB(rCardTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays number of yellow cards for Team B.
     */
    public void displayYcardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardsB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays number of red cards for Team B.
     */
    public void displayRcardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardsB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This resets the gamescore
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yCardTeamA = 0;
        rCardTeamA = 0;
        yCardTeamB = 0;
        rCardTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYcardForTeamA(yCardTeamA);
        displayRcardForTeamA(rCardTeamA);
        displayYcardForTeamB(yCardTeamB);
        displayRcardForTeamB(rCardTeamB);
    }
}