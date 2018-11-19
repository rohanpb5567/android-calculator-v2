package com.calculator.android.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {

    private Button mBack2Main;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        mRecyclerView = (RecyclerView) findViewById(R.id.history_recycler);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter();
        mRecyclerView.setAdapter(mAdapter);


        mBack2Main = (Button) findViewById(R.id.button_back2main);
        mBack2Main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startNewActivity = new Intent(HistoryActivity.this, CalculatorActivity.class);
                startActivity(startNewActivity);
            }
        });
    }
}
