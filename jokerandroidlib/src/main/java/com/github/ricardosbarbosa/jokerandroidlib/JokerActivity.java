package com.github.ricardosbarbosa.jokerandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {

    String joke = "?";

    public static final String JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        joke = getIntent().getStringExtra(JOKE);

        TextView textView = (TextView) findViewById(R.id.joke_string);
        textView.setText(joke);
    }
}
