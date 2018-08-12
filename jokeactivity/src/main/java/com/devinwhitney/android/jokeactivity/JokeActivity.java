package com.devinwhitney.android.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String JOKES_EXTRA = "jokes_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView mJokeTextBox = findViewById(R.id.displayJoke);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKES_EXTRA);
        mJokeTextBox.setText(joke);
    }
}
