package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mResultButton;
    private EditText mPersonEditText;
    private EditText mNounEditText;
    private EditText mVerbEditText;
    private EditText mVerb2EditText;
    private EditText mNoun2EditText;
    private EditText mAdjectiveEditText;
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPersonEditText = (EditText) findViewById(R.id.personEditText);
        mNounEditText = (EditText) findViewById(R.id.nounEditText);
        mVerbEditText = (EditText) findViewById(R.id.verbEditText);
        mVerb2EditText = (EditText) findViewById(R.id.verb2EditText);
        mNoun2EditText = (EditText) findViewById(R.id.noun2EditText);
        mAdjectiveEditText = (EditText) findViewById(R.id.adjectiveEditText);
        mResultButton = (Button) findViewById(R.id.resultButton);
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);


        mResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String person = mPersonEditText.getText().toString();
                String noun = mNounEditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                String verb2 = mVerb2EditText.getText().toString();
                String noun2 = mNoun2EditText.getText().toString();
                String adjective = mAdjectiveEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Finish.class);
                intent.putExtra("person", person);
                intent.putExtra("noun", noun);
                intent.putExtra("verb", verb);
                intent.putExtra("verb2", verb2);
                intent.putExtra("noun2", noun2);
                intent.putExtra("adjective", adjective);
                startActivity(intent);
            }
        });
    }
}