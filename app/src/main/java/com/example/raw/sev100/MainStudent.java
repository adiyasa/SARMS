package com.example.raw.sev100;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button cScore = (Button) findViewById(R.id.cScore);

        cScore.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent myIntent = new Intent(MainStudent.this, UnitListView.class);
                startActivity(myIntent);
            }
        });

        Button cAtt = (Button) findViewById(R.id.cAtt);

        cAtt.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                //Intent myIntent = new Intent(MainStudent.this, UnitListView.class);
                //startActivity(myIntent);
            }
        });

        Button cInbox = (Button) findViewById(R.id.cInbox);

        cInbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent myIntent = new Intent(MainStudent.this, Inbox.class);
                startActivity(myIntent);
            }
        });
    }



}
