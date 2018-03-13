package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Finish extends AppCompatActivity {
    private TextView mPersonTextView;
    private TextView mNounTextView;
    private TextView mVerbTextView;
    private TextView mVerb2TextView;
    private TextView mNoun2TextView;
    private TextView mAdjectiveTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        mPersonTextView = (TextView) findViewById(R.id.personTextView);
        mNounTextView = (TextView) findViewById(R.id.nounTextView);
        mVerbTextView = (TextView) findViewById(R.id.verbTextView);
        mVerb2TextView = (TextView) findViewById(R.id.verb2TextView);
        mNoun2TextView = (TextView) findViewById(R.id.noun2TextView);
        mAdjectiveTextView = (TextView) findViewById(R.id.adjectiveTextView);
        Intent intent = getIntent();
        String person = intent.getStringExtra("person");
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String verb2 = intent.getStringExtra("verb2");
        String noun2 = intent.getStringExtra("noun2");
        String adjective = intent.getStringExtra("adjective");
        mPersonTextView.setText(person + " was walking through the mall. ");
        mNounTextView.setText("Suddenly, in the distance there was the screeching noise of a " + noun +".");
        mVerbTextView.setText("Time to " + verb +".");
        mAdjectiveTextView.setText("Shit! There's a(n) " + adjective);
        mNoun2TextView.setText(noun2 + " in the way!");
        mVerb2TextView.setText("The only way around this is to " + verb2);






    }
}
