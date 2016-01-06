package com.example.sarthak.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //score variable
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    //on pressing +3 points button
    public void threePointsA(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    //on pressing +2 points button
    public void twoPointsA(View view){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    //on pressing free throw button
    public void freeThrowA(View view){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    //on pressing +3 points button
    public void threePointsB(View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    //on pressing +2 points button
    public void twoPointsB(View view){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    //on pressing free throw button
    public void freeThrowB(View view){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //on the click of reset
    public void reset(View view){
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
