package com.example.android.courtcounter;

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

    int scoreA = 0;
    int scoreB = 0;

    public void points3(View view) {
        scoreA = scoreA + 3;
        scoreA = 0;
        displayA(scoreA);
    }

    public void Points3(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void points2(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void Points2(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void points1(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void Points1(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void CHECKA(View view) {
        {
            if(scoreA > 0)
                scoreA = scoreA - 1;
            else
                scoreA = 0;
        }
        displayA(scoreA);
    }

    public void CHECKB(View view) {
        {
            if(scoreB > 0)
                scoreB = scoreB - 1;
            else
                scoreB = 0;
        }
        displayB(scoreB);
    }

    public void RESET(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayA(int number) {
        TextView scoreATextView = (TextView) findViewById(R.id.TotalA);
        scoreATextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView scorebTextView = (TextView) findViewById(R.id.TotalB);
        scorebTextView.setText("" + number);
    }
}

