package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private int ahlyScore = 0;
    private int zamalekScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScore();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team Ahly by 1 goal.
     */
    public void addGoalForAhly(View v) {
        ahlyScore = ahlyScore + 1;
        displayForAhly(ahlyScore);
    }

    /**
     * Increase the score for Team Zamalek by 1 goal.
     */
    public void addGoalForZamalek(View v) {
        zamalekScore = zamalekScore + 1;
        displayForZamalek(zamalekScore);
    }

    /**
     * Displays the given score for Team Ahly.
     * @param score given int score value to display
     */
    public void displayForAhly(int score) {
        TextView ahlyScoreTextView = findViewById(R.id.ahly_score_text_view);
        ahlyScoreTextView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Zamalek.
     */
    public void displayForZamalek(int score) {
        TextView zamalekScoreTextView = findViewById(R.id.zamalek_score_text_view);
        zamalekScoreTextView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0.
     */
    private void resetScore() {
        ahlyScore = 0;
        zamalekScore = 0;
        displayForAhly(ahlyScore);
        displayForZamalek(zamalekScore);
    }

}
