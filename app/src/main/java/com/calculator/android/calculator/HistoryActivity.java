package com.calculator.android.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {

    private Button mBack2Main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        mBack2Main = (Button) findViewById(R.id.button_back2main);
        mBack2Main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startNewActivity = new Intent(HistoryActivity.this, CalculatorActivity.class);
                startActivity(startNewActivity);
            }
        });
    }
}
