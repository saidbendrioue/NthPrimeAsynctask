package com.example.said.myapplication01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NthPrimeActivity extends Activity {
    static TextView nthPrimeresultview ;
    static EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nthprimelayout);
        Button nthPrimeButton = (Button) findViewById(R.id.nthprime);
        nthPrimeresultview = (TextView) findViewById(R.id.nprimresult);
        input = (EditText)findViewById(R.id.input);
        nthPrimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new NthPrimeTask().execute(Integer.parseInt(input.getText().toString()));
            }
        });
    }
}

