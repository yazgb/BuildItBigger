package com.android.yaz.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke_key";

    private TextView mJokeTextView;
    private TextView mErrorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJokeTextView = (TextView) findViewById(R.id.joke_tv);
        mErrorTextView = (TextView) findViewById(R.id.error_message_tv);

        Intent intent = getIntent();
        if(intent.hasExtra(JOKE_KEY)) {
            String joke = intent.getStringExtra(JOKE_KEY);

            if(!TextUtils.isEmpty(joke)) {
                showJoke();
                mJokeTextView.setText(joke);
            }
            else
                showErrorMessage();
        }
    }

    private void showJoke() {
        mJokeTextView.setVisibility(View.VISIBLE);
        mErrorTextView.setVisibility(View.INVISIBLE);
    }

    private void showErrorMessage() {
        mJokeTextView.setVisibility(View.INVISIBLE);
        mErrorTextView.setVisibility(View.VISIBLE);
    }
}
