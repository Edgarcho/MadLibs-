package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Finish extends AppCompatActivity {
    private TextView mPersonTextView;
    private TextView mNounTextView;
    private TextView mVerbTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        mPersonTextView = (TextView) findViewById(R.id.personTextView);
        mNounTextView = (TextView) findViewById(R.id.nounTextView);
        mVerbTextView = (TextView) findViewById(R.id.verbTextView);
        Intent intent = getIntent();
        String person = intent.getStringExtra("person");
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        mPersonTextView.setText("Here is a person: " + person);
        mNounTextView.setText("Here is a noun: " + noun);
        mVerbTextView.setText("Here is a verb: " + verb);



    }
}
